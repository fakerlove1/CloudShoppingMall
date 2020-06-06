package com.ak.service;

import com.ak.Goods;
import com.ak.OrderItem;

import java.util.List;

public interface SellerService {

    /**
     * 查找账单
     * @param seller_id
     * @return
     */
    List<OrderItem> FindBill(int seller_id);

    /**
     * 添加商品
     * @param goods
     * @return
     */
    int AddGoods(Goods goods);

    int ModifyGoods(Goods goods);

    int DeleteGoods(int goods_id);



}
