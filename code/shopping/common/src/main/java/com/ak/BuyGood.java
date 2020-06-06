package com.ak;

import lombok.Data;

/**
 * 购买物品
 */
@Data
public class BuyGood {
    /*购买商品的id

     */
    private Integer goods_id;

    /* 购买 数量和物品
    */
    private Integer buy_number;

    public BuyGood() {
    }

    public BuyGood(Integer goods_id, Integer buy_number) {
        this.goods_id = goods_id;
        this.buy_number = buy_number;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getBuy_number() {
        return buy_number;
    }

    public void setBuy_number(Integer buy_number) {
        this.buy_number = buy_number;
    }
}

