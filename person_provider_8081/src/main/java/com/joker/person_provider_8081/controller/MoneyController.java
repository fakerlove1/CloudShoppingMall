package com.joker.person_provider_8081.controller;


import com.joker.common.pojo.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户控制类
 */
@Controller
@RequestMapping("/person")
public class MoneyController {


    @RequestMapping("/login")
    @ResponseBody
    public  ResultData<String> login(String username,String password){
       ResultData<String> data=new ResultData<>();
       data.setCode(200);
       data.setMessage("登录成功");
       data.setData("成功了");
       return data;

    }
}
