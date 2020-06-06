package com.ak.controller.person;


import com.ak.feign.LoginService;
import com.ak.Person;
import com.ak.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;

/**
 * 这里的修改信息的地方,
 * 删除用户的 地方
 */
@Controller
@RequestMapping("/Person")
public class ModifyController {

    LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }


    @RequestMapping("/Modify")
    @ResponseBody
    public ResultData<String> modify(@RequestParam("person") Person person, @RequestParam(value = "file",required = false)MultipartFile file, @RequestParam("request") HttpServletRequest request) throws FileNotFoundException {
        return loginService.modify(person,file,request);
    }

    @RequestMapping("/Add")
    @ResponseBody
    public ResultData<Integer> add(@RequestBody Person person) {
        return loginService.add(person);
    }
}
