package com.joker.personprovider8081.service.impl;


import com.joker.personprovider8081.mapper.PersonMapper;
import com.joker.personprovider8081.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl  implements LoginService {


    @Autowired
    PersonMapper personMapper;
    @Override

    public int LoginCheck(String user_id, String user_name) {
        int result=personMapper.CheckLogin(user_id,user_name);
        if(result>=1){
            return 200;
        }
        return -1;
    }
}
