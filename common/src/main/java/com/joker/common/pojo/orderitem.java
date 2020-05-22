package com.joker.common.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单  子项
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class orderitem {
    private int orderitem_key;
    private String order_id;
    private int goods_id;
    private String seller_name;
    private int buy_number;
    private Double item_money;

}
