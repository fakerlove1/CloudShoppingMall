package com.joker.common.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class shoppingcar {
    private int shoppingcar_key;
    private int goods_id;
    private String user_name;
    private int shopping_goodsnumber;
    private Double shopping_needmoney;

}
