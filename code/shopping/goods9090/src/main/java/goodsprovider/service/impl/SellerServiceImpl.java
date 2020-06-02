package goodsprovider.service.impl;

import common.pojo.Goods;
import common.pojo.OrderItem;
import common.pojo.Person;
import goodsprovider.mapper.GoodMapper;
import goodsprovider.mapper.OrderAllMapper;
import goodsprovider.mapper.PersonMapper;
import goodsprovider.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 卖家 业务逻辑处理  层
 *
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private OrderAllMapper orderAllMapper;

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public List<OrderItem> FindBill(int seller_id) {
        Person person=personMapper.FindPersonById(seller_id);
        if(person==null){
            return null;
        }
        return  orderAllMapper.FindOrderItem(seller_id);
    }

    @Override
    public int AddGoods(Goods goods) {
        System.out.println("Service"+goods);
        return goodMapper.AddGoods(goods);
    }

    @Override
    public int ModifyGoods(Goods goods) {
        return goodMapper.ModifyGoods(goods);
    }

    @Override
    public int DeleteGoods(int goods_id) {
        return goodMapper.DeleteGoodsById(goods_id);
    }
}
