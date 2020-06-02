package personprovider8081.controller;


import common.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import personprovider8081.service.impl.MoneyServiceImpl;

/**
 * 用户控制类
 */
@Controller
@RequestMapping("/person")
public class MoneyController {

    @Autowired
    MoneyServiceImpl moneyService;

    /**
     * 充值业务
     * @param money
     * @param user_id
     * @return
     */
    @RequestMapping("/addmoney")
    @ResponseBody
    public ResultData<String> addmoney(@RequestParam("money") Double money,@RequestParam("user_id") int user_id){

       ResultData<String> data=new ResultData<>();
       System.out.println("addmoney"+money+user_id);
       int result=moneyService.AddMoney(money,user_id);
       if(result>0){
           data.setCode(200);
           data.setMessage("充值业务完成");
           data.setData("成功了");
       }else {
           data.setCode(-1);
           data.setMessage("充值业务失败");
           data.setData("对不起失败");
       }

       return data;

    }
}
