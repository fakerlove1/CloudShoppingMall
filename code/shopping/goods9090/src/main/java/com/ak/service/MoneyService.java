package com.ak.service;

import com.ak.BuyGood;
import com.ak.ResultData;

import java.util.Map;

/**
 * 商品的 只有转账
 */
public interface MoneyService {

    /**
     * 转账 业务
     * @param money 需要转账钱的数目
     * @param from  转账的人员
     * @param to  转账的目标
     * @return  不成功返回0
     */
    int ModifyMoney(Double money,int from,int to);


    ResultData<Map<String,Object>> BuyGoods(BuyGood[] buyGoods, int user_id);

    /**
     * 充钱业务
     * @param money  需要转账的钱的数目
     * @param to 转账的目标
     * @return 是否成功 ，不成功返回0
     */
    int AddMoney(Double money,int to);
}
