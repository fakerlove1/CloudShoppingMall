package goodsprovider.service.impl;

import common.pojo.Goods;
import common.pojo.Shoppingcar;
import goodsprovider.mapper.GoodMapper;
import goodsprovider.mapper.ShoppingCarMapper;
import goodsprovider.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 购物车的 Service 层
 */
@Service
public class ShoppingCarServiceImpl  implements ShoppingCarService {

    @Autowired
    private ShoppingCarMapper shoppingCarMapper;

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public int AddShoppingCar(int goods_id, int user_id,int number) {
        Shoppingcar shoppingcar1=shoppingCarMapper.SeletShoppingCarByGoodsID(user_id,goods_id);
        if(shoppingcar1!=null){
            int nu=shoppingcar1.getShopping_goodsnumber();
         shoppingcar1.setShopping_goodsnumber(nu+1);
         shoppingcar1.setShopping_needmoney(shoppingcar1.getShopping_needmoney()*(nu+1)/nu);
         shoppingCarMapper.ModifyShoppingCar(shoppingcar1);
        }else{
            Shoppingcar shoppingcar=new Shoppingcar();
            shoppingcar.setGoods_id(goods_id);
            Goods goods=goodMapper.FindGoodsById(goods_id);
            shoppingcar.setShopping_goodsnumber(number);
            shoppingcar.setShopping_needmoney(goods.getSell_price()*number);
            shoppingcar.setUser_id(user_id);
            shoppingCarMapper.AddShoppingCar(shoppingcar);
        }
        return 1;
    }

    @Override
    public int DeleteShoppingCar(int user_id, int goods_id) {


        return shoppingCarMapper.DeleteShoppingCar(user_id,goods_id);
    }

    @Override
    public int ModifyShoppingCar(int user_id,int goods_id,int number) {

        Shoppingcar shoppingcar=new Shoppingcar();
        shoppingcar=shoppingCarMapper.SeletShoppingCarByGoodsID(user_id,goods_id);
        Goods goods=goodMapper.FindGoodsById(goods_id);
        if(number<=0){
            number=1;
        }
        shoppingcar.setShopping_goodsnumber(number);
        shoppingcar.setShopping_needmoney(goods.getSell_price()*number);
        return shoppingCarMapper.ModifyShoppingCar(shoppingcar);
    }

    @Override
    public List<Shoppingcar> SelectShoppingCar(int user_id) {
        return shoppingCarMapper.SelectShoppingCar(user_id);
    }
}
