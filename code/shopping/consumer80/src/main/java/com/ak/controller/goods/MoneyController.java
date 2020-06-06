package com.ak.controller.goods;

import com.ak.feign.GoodService;
import com.ak.Impl.Buy;
import com.ak.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/Money")
public class MoneyController {


    GoodService goodService;

    @Autowired
    public void setGoodService(GoodService goodService) {
        this.goodService = goodService;
    }

    @RequestMapping("/Buy")
    public ResultData<Map<String,Object>> buy(@RequestBody Buy buy){

        return  goodService.buy(buy);
    }

    @RequestMapping("/Tranfer")
    public ResultData<String> transfer(@RequestParam("money") Double money, @RequestParam("from") int  from, @RequestParam("to") int to){

        return goodService.transfer(money,from,to);
    }

    @RequestMapping("/Add")
    public ResultData<Map<String,Object>> Add(@RequestParam("money") Double money,@RequestParam("to") int to){

        return  goodService.Add(money,to);
    }


}
