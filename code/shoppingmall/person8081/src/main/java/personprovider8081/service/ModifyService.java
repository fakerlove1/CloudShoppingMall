package personprovider8081.service;

import common.pojo.Person;
import common.pojo.ResultData;

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
