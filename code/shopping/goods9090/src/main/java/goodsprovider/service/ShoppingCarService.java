package goodsprovider.service;

import common.pojo.Shoppingcar;


import java.util.List;

public interface ShoppingCarService {

    int AddShoppingCar(int goods_id, int user_id,int number);

    int DeleteShoppingCar(int user_id,int goods_id);

    int ModifyShoppingCar(int user_id,int goods_id,int number);

    List<Shoppingcar> SelectShoppingCar(int user_id);

}
