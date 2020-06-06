package com.ak.controller;



import com.ak.Person;
import com.ak.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ak.service.impl.LoginServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户控制类
 */
@Controller
@RequestMapping("/Person")
public class LoginController {

    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    LoginServiceImpl loginService;

    @Autowired
    public void setLoginService(LoginServiceImpl loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("/Login")
    @ResponseBody
    public ResultData<Person> login( Integer user_id,String user_password){
        ResultData<Person> data=new ResultData<>();
        System.out.println(user_id+"  "+user_password);
        try {
           Person result= loginService.LoginCheck(user_id, user_password);
            if(result!=null){
                data.setCode(200);
                data.setMessage("登录成功");
                data.setData(result);
            }else {
                data.setCode(-1);
                data.setMessage("登录失败");
                data.setData(null);
            }

        }catch (Exception e){
            e.printStackTrace();
            logger.info("对不起 登录出现问题");
        }
       return data;
    }

    @RequestMapping("/FindAll")
    @ResponseBody
    public ResultData<List<Person>> findall(@RequestParam("user_lev") int user_lev){
        ResultData<List<Person>> data=new ResultData<>();
        System.out.println(user_lev);
        try {
            List<Person> result= new ArrayList<>();
            result=loginService.findall(user_lev);

            if(result!=null&&result.size()>=0){
                data.setCode(200);
                data.setMessage("查找成功");
                data.setData(result);
            }else {
                data.setCode(-1);
                data.setMessage("查找失败");
                data.setData(null);
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("对不起 登录出现问题");
        }
        return data;
    }
}
