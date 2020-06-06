package com.ak.service.impl;

import com.ak.Impl.OrderAll;
import com.ak.Impl.OrderItems;
import com.ak.mapper.OrderAllMapper;
import com.ak.service.OrderService;
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
