package com.joker.personprovider8081.controller;


import com.joker.common.pojo.ResultData;
import com.joker.personprovider8081.service.impl.LoginServiceImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户控制类
 */
@Controller
@RequestMapping("/person")
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    Logger logger=Logger.getLogger(LoginController.class);


    @RequestMapping("/login")
    @ResponseBody
    public  ResultData<String> login(String username,String password){
        ResultData<String> data=new ResultData<>();

        try {
           int result= loginService.LoginCheck(username, password);

            data.setCode(result);
            if(result==200){
                data.setMessage("登录成功");
                data.setData("成功了");
            }else {

                data.setMessage("登录失败");
                data.setData("有异常原因");
            }

        }catch (Exception e){
            e.printStackTrace();
            logger.info("对不起 登录出现问题");

        }


       return data;

    }
}
