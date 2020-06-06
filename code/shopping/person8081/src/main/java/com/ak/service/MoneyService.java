package com.ak.service;

public interface MoneyService {

    /**
     * 加钱
     * @return
     */
    int  AddMoney(Double money,int user_id);
    int  MinMoney(Double money,int user_id);

}
