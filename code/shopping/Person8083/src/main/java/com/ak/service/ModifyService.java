package com.ak.service;

import com.ak.Person;
import com.ak.ResultData;

public interface ModifyService {

    ResultData<String> ModifyPerson(Person person);

    /**
     * 用昵称注册
     *
     * @param person
     * @return  用户 的id
     */
    ResultData<Integer> AddPerson(Person person);
}
