package goodsprovider.service.impl;

import common.pojo.Impl.OrderAll;
import common.pojo.Impl.OrderItems;
import common.pojo.OrderItem;
import goodsprovider.mapper.OrderAllMapper;
import goodsprovider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    OrderAllMapper orderAllMapper;

    @Autowired
    public void setOrderAllMapper(OrderAllMapper orderAllMapper) {
        this.orderAllMapper = orderAllMapper;
    }

    @Override
    public List<OrderAll> FindPersonOrder(int user_id) {

        return orderAllMapper.FindOrder(user_id);
    }

    @Override
    public List<OrderItems> FindShoppingOrder(int seller_id) {
        return orderAllMapper.FindOrderItems(seller_id);
    }
}
