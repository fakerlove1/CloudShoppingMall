package goodsprovider.mapper;

import common.pojo.Shoppingcar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ShoppingCar Mapper 层
 */
@Mapper
@Repository
public interface ShoppingCarMapper {

    int AddShoppingCar(Shoppingcar shoppingcar);

    int DeleteShoppingCar(@Param("user_id") int user_id , @Param("goods_id") int goods_id);

    int ModifyShoppingCar(Shoppingcar shoppingcar);

    List<Shoppingcar> SelectShoppingCar(int user_id);

    Shoppingcar SeletShoppingCarByGoodsID(@Param("user_id") int user_id , @Param("goods_id") int goods_id);

}
