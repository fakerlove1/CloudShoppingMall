package com.ak;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单  子项
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    private int orderitem_key;
    private String order_id;
    private int goods_id;
    private int seller_id;
    private int buy_number;
    private Double item_money;
    private Goods goods;

}
