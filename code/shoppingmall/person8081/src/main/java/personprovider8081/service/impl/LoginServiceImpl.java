package personprovider8081.service.impl;



import common.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personprovider8081.mapper.PersonMapper;
import personprovider8081.service.LoginService;

import java.util.List;

@Service
public class LoginServiceImpl  implements LoginService {


    @Autowired
    PersonMapper personMapper;


    /**
     * 登录用户，并且返回用户信息
     * @param user_id
     * @param user_name
     * @return
     */
    @Override
    public Person LoginCheck(int user_id, String user_name) {

        int result=personMapper.CheckLogin(user_id,user_name);
        if(result>=1){
            return personMapper.FindPersonById(user_id);
        }
        return null;
    }

    @Override
    public List<Person> findall(int user_lev) {
       return personMapper.FindPersonAll(user_lev);
    }
}
