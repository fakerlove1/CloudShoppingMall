package goodsprovider.mapper;

import common.pojo.Shoppingcar;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShoppingCarMapper {

    /**
     * 添加购物车
     * @param shoppingcar
     * @return
     */
    int AddShoppingCar(Shoppingcar shoppingcar);

    int DeleteShoppingCar(int shoppingcar_key);

    int ModifyShoppingCar(Shoppingcar shoppingcar);

    List<Shoppingcar> SelectShoppingCar(int user_id);
}
