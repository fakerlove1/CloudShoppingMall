package com.ak.controller.person;


import com.ak.feign.LoginService;
import com.ak.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户控制类
 */
@Controller
@RequestMapping("/person")
public class PersonMoneyController {


    LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }


    @RequestMapping("/addmoney")
    @ResponseBody
    public ResultData<String> addmoney(@RequestParam("money") Double money,@RequestParam("user_id") Integer user_id){
       return loginService.addmoney(money,user_id);
    }
}
