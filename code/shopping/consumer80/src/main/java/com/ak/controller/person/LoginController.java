package com.ak.controller.person;



import com.ak.feign.LoginService;
import com.ak.Person;
import com.ak.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户控制类
 */
@Controller
@RequestMapping("/Person")
public class LoginController {

    LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("/Login")
    @ResponseBody
    public ResultData<Person> login(@RequestParam("user_id") Integer user_id,@RequestParam("user_password") String user_password){

       return loginService.login(user_id,user_password);
    }

    @RequestMapping("/FindAll")
    @ResponseBody
    public ResultData<List<Person>> findall(@RequestParam("user_lev") Integer user_lev){
        return loginService.findall(user_lev);
    }
}
