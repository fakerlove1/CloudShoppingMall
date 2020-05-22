package com.joker.common.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品信息
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class goods {

    private int goods_id;
    private String goods_name;
    private int goods_type;
    private String seller_name;
    private String banner_img;
    private String priviewInformation;
    private Double sell_price;
    private Double original_price;
    private int surplus;
    private int sale;


}
