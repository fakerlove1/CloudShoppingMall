package com.ak.service;

import com.ak.Impl.OrderAll;
import com.ak.Impl.OrderItems;

import java.util.List;

public interface OrderService {

    List<OrderAll> FindPersonOrder(int user_id);

    List<OrderItems> FindShoppingOrder(int seller_id);

}
