package com.ak.Impl;

import com.ak.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

/**
 * 用户的订单表
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderAll {

    private int order_key;
    private String order_id;
    private int user_id;
    private Timestamp order_time;
    private Double all_money;
    private List<OrderItem> orderItems;

}
