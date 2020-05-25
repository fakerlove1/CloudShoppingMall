package personprovider8081.service;

import common.pojo.Person;
import common.pojo.ResultData;

import java.util.List;

public interface LoginService{

    Person LoginCheck(int user_id, String user_name);

    List<Person> findall(int user_lev);
}
