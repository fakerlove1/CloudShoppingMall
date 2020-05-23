package com.joker.personprovider8081.controller;


import com.joker.common.pojo.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 这里的修改信息的地方
 */
@Controller
@RequestMapping("/person")
public class ModifyController {

    @RequestMapping("/modify")
    @ResponseBody
    public ResultData<String> login(String username, String password){
        ResultData<String> data=new ResultData<>();
        data.setCode(200);
        data.setMessage("登录成功");
        data.setData("成功了");
        return data;

    }
}
