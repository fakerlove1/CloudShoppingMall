package com.ak.controller.goods;

import com.ak.feign.GoodService;
import com.ak.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 账单的表现层
 */
@RestController
@RequestMapping("/Order")
public class OrderController {

    GoodService goodService;

    @Autowired
    public void setGoodService(GoodService goodService) {
        this.goodService = goodService;
    }


    @RequestMapping("/User")
    public ResultData<Map<String,Object>> User(@RequestParam("user_id") Integer user_id){
        return goodService.User(user_id);
    }

    /**
     *
     * @param seller_id  商家的id
     * @return 返回 商家账单信息
     */
    @RequestMapping("/Shopping")
    public ResultData<Map<String,Object>> shopping(@RequestParam("seller_id") Integer seller_id){
        return goodService.shopping(seller_id);
    }

}
