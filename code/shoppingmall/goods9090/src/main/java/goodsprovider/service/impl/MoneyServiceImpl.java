package goodsprovider.service.impl;

import common.pojo.BuyGood;
import common.pojo.Goods;
import common.pojo.Person;
import common.pojo.ResultData;
import goodsprovider.mapper.GoodMapper;
import goodsprovider.mapper.PersonMapper;
import goodsprovider.service.MoneyService;
import org.graalvm.compiler.serviceprovider.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private GoodMapper goodMapper;

    /**
     * 转钱业务
     * @param money
     * @param from
     * @param to
     * @return
     */
    @Override
    public int ModifyMoney(Double money, int from, int to) {
        Person p_from=personMapper.FindPersonById(from);
        Person p_to=personMapper.FindPersonById(to);
        /**
         * 两个用户不在
         */
        if(p_from==null||p_from==null){

            return -1;
        }
        /**
         * 表示 from 余额不足
         */
        if(p_from.getUser_money()<money){
            return -1;
        }
        int res1=personMapper.AddMoney(p_from.getUser_money()-money,from);
        int res2=personMapper.AddMoney(p_to.getUser_money()+money,to);
        /**
         * 转账过程中发现问题
         */
        if(res1<=0||res2<=0){
            return -1;
        }
        return 1 ;
    }

    /**
     * 购买物品，涉及到很多东西
     * 1 检验物品是否够用
     * 2 购物车清除
     * 3 用户的钱扣除
     * 4 商品的修改
     * 5 商家钱的添加
     * 6 账单的添加
     * @param buyGoods
     * @param user_id
     * @return
     */
    @Override
    public ResultData<String> BuyGoods(BuyGood[] buyGoods, int user_id) {

        ResultData<String> data=new ResultData<>();
        Person person=personMapper.FindPersonById(user_id);
        Double money=0.0;

        // 1 检验商品是否够用，用户的钱是否充足
        for(BuyGood item:buyGoods){
            Goods goods=goodMapper.FindGoodsById(item.getGoods_id());
            money+=goods.getSell_price();
            if(goods.getSurplus()<item.getBuy_number()){
                data.setData(goods.getGoods_name()+"数量不够");
                data.setCode(-1);
                data.setMessage("购买物品失败");
                return data;
            }
        }

        // 2 清除购物车

        return data;
    }


}
