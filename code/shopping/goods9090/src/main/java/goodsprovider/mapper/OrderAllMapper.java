package goodsprovider.mapper;

import common.pojo.Impl.OrderAll;
import common.pojo.Impl.OrderItems;
import common.pojo.Order;
import common.pojo.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单的的Mapper
 */
@Mapper
@Repository
public interface OrderAllMapper {

    /**
     * 根据用户的的id 来查找用户所有的ID 信息
     * @param user_id
     * @return
     */
    List<OrderAll> FindOrder(int user_id);

    /**
     * 添加用户订单
     * @param order
     * @return
     */
    int AddOrder(Order order);

    /**
     * 添加订单子项
     * @param orderitem
     * @return
     */
    int AddOrderItem(OrderItem orderitem);


    /**
     * 给商家来查找自己订单信息的
     * @param seller_id
     * @return
     */
    List<OrderItem> FindOrderItem(int seller_id);



    List<OrderItems> FindOrderItems(int seller_id);

}
