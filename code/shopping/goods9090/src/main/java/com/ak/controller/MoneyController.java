package com.ak.controller;

import com.ak.service.impl.GoodServiceImpl;
import com.ak.Impl.Buy;
import com.ak.ResultData;
import com.ak.service.impl.MoneyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/Money")
public class MoneyController {



    GoodServiceImpl goodService;

    @Autowired
    public void setGoodService(GoodServiceImpl goodService) {
        this.goodService = goodService;
    }

    @Autowired
    public void setMoneyService(MoneyServiceImpl moneyService) {
        this.moneyService = moneyService;
    }


    MoneyServiceImpl moneyService;


    /**
     * 购买商品
     * @param buy 传入的数组
     * @return 返回前端所需要的的 json
     */
    @RequestMapping("/Buy")
    public ResultData<Map<String,Object>> buy(@RequestBody Buy buy){
        System.out.println(buy);
        return  moneyService.BuyGoods(buy.getBuyGoods(),buy.getUser_id());
    }


    /**
     * 给别人的转账窗口
     * @param money
     * @param from
     * @param to
     * @return
     */
    @RequestMapping("/Tranfer")
    public ResultData<String> transfer(@RequestParam("money") Double money, @RequestParam("from") int  from, @RequestParam("to") int to){

        System.out.println(money+"  "+from+"  "+to);
        ResultData<String> data=new ResultData<>();
        int result=moneyService.ModifyMoney(money,from,to);
        if(result>0){
            data.setCode(200);
            data.setMessage("转账成功");
            data.setData("成功了");
        }else {
            data.setCode(-1);
            data.setMessage("转账失败");
            data.setData("对不起");
        }
        return data;
    }

    /**
     * 充值业务
     * @param money  需要充值的钱
     * @param to  转账的目标
     * @return
     */
    @RequestMapping("/Add")
    public ResultData<Map<String,Object>> Add(Double money,int to){
        ResultData<Map<String,Object>> data=new ResultData<>();

       Map<String,Object> map=new HashMap<>();
       int result=moneyService.AddMoney(money,to);
       if(result>0){
          map.put("message","充钱业务完成");
          data.setCode(200);
          data.setMessage("成功");
          data.setData(map);
       }else{
           map.put("message","充钱业务失败");
           data.setCode(-1);
           data.setMessage("失败");
           data.setData(map);
       }
        return  data;
    }


}
