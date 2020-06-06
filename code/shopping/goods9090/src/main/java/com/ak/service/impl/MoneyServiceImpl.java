package com.ak.service.impl;

import com.ak.*;
import com.ak.mapper.GoodMapper;
import com.ak.mapper.OrderAllMapper;
import com.ak.mapper.PersonMapper;
import com.ak.mapper.ShoppingCarMapper;
import com.ak.service.MoneyService;
import com.ak.utils.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * 财务的 Service
 */
@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private ShoppingCarMapper shoppingCarMapper;

    @Autowired
    private OrderAllMapper orderAllMapper;




    /**
     * 转钱业务
     *
     * @param money
     * @param from
     * @param to
     * @return
     */
    @Override
    public int ModifyMoney(Double money, int from, int to) {
        Person p_from = personMapper.FindPersonById(from);
        Person p_to = personMapper.FindPersonById(to);
        /**
         * 两个用户不在
         */
        if (p_from == null || p_from == null) {

            return -1;
        }
        /**
         * 表示 from 余额不足
         */
        if (p_from.getUser_money() < money) {
            return -1;
        }
        int res1 = personMapper.AddMoney(p_from.getUser_money() - money, from);
        int res2 = personMapper.AddMoney(p_to.getUser_money() + money, to);
        /**
         * 转账过程中发现问题
         */
        if (res1 <= 0 || res2 <= 0) {
            return -1;
        }
        return 1;
    }

    /**
     * 购买物品，涉及到很多东西
     * 1 检验物品是否够用
     * 2 购物车清除
     * 3 商品的修改
     * 4 商家钱的添加
     * 5 账单的添加
     * 6 用户的钱扣除
     *
     * @param buyGoods
     * @param user_id
     * @return
     */
    @Override
    public ResultData<Map<String,Object>> BuyGoods(BuyGood[] buyGoods, int user_id) {

        ResultData<Map<String,Object>> data = new ResultData<>();
        Map<String,Object> map=new HashMap<>();

        Person person = personMapper.FindPersonById(user_id);
        if (person == null || person.getUser_id() <= 0) {
            map.put("message","对不起传入的id 有问题");
            data.setData(map);
            data.setCode(-1);
            data.setMessage("购买物品失败");
        }
        Double money = 0.0;

        // 1 检验商品是否够用，用户的钱是否充足
        for (BuyGood item : buyGoods) {
            Goods goods = goodMapper.FindGoodsById(item.getGoods_id());
            money += goods.getSell_price();
            if (goods.getSurplus() < item.getBuy_number()) {
                map.put("message",goods.getGoods_name() + "数量不够");
                data.setData(map);
                data.setCode(-1);
                data.setMessage("购买物品失败");
                return data;
            }
        }

        if(money>person.getUser_money()){
            map.put("message","对不起用户的钱财不够");
            data.setData(map);
            data.setCode(-1);
            data.setMessage("购买物品失败");
            return data;
        }
        Order order = new Order();
        order.setUser_id(user_id);
        order.setOrder_time(new Timestamp(System.currentTimeMillis()));
        order.setOrder_id(RandomString.getRandomString(24));
        order.setAll_money(money);
        orderAllMapper.AddOrder(order);

        for (BuyGood item : buyGoods) {
//          2 清除购物车
            shoppingCarMapper.DeleteShoppingCar(user_id, item.getGoods_id());
//          3 商品的修改
            Goods goods = goodMapper.FindGoodsById(item.getGoods_id());
            goods.setSurplus(goods.getSurplus() - item.getBuy_number());
            goods.setSale(goods.getSale() + item.getBuy_number());
            goodMapper.ModifyGoods(goods);
//          4 商家钱的添加,商品的价格+商品的
            personMapper.AddMoney(goods.getSell_price() * item.getBuy_number(), goods.getSeller_id());
//          5 账单的添加
            OrderItem orderitem = new OrderItem();
            orderitem.setItem_money(goods.getSell_price() * item.getBuy_number());
            orderitem.setSeller_id(goods.getSeller_id());
            orderitem.setBuy_number(item.getBuy_number());
            orderitem.setGoods_id(item.getGoods_id());
            orderitem.setOrder_id(order.getOrder_id());
            orderAllMapper.AddOrderItem(orderitem);
        }
//           6 扣除用户的钱
        int result=personMapper.MinMoney(money, user_id);

        if(result>0){
            map.put("message","购买成功");
            data.setData(map);
            data.setCode(200);
            data.setMessage("购买物品成功");
        }else{
            map.put("message","失败，服务器内部原因");
            data.setData(map);
            data.setCode(-1);
            data.setMessage("购买物品失败");
        }
        return data;
    }

    @Override
    public int AddMoney(Double money, int to) {
        return  personMapper.AddMoney(money,to);
    }

}
