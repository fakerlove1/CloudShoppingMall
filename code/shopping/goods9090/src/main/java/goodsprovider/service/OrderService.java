package goodsprovider.service;

import common.pojo.Impl.OrderAll;
import common.pojo.Impl.OrderItems;
import common.pojo.OrderItem;

import java.util.List;

public interface OrderService {

    List<OrderAll> FindPersonOrder(int user_id);

    List<OrderItems> FindShoppingOrder(int seller_id);

}
