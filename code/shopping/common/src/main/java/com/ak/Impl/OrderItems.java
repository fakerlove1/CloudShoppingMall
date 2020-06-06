package com.ak.Impl;

import com.ak.Order;
import com.ak.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class OrderItems {

    private int orderitem_key;
    private String order_id;
    private int goods_id;
    private int seller_id;
    private int buy_number;
    private Double item_money;

    private Order order;
    private Person person;

}
