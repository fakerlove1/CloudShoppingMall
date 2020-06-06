package com.ak.controller.goods;

import com.ak.feign.GoodService;
import com.ak.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 返回商品信息的类
 *  首页商品信息类
 *
 */
@RestController
@RequestMapping("/Good")
public class GoodController {


    GoodService goodService;

    @Autowired
    public void setGoodService(GoodService goodService) {
        this.goodService = goodService;
    }

    @RequestMapping("/FindGoodOne")
    public ResultData<Map<String,Object>> FindGoodsOne(){

        return  goodService.FindGoodsOne();
    }

    @RequestMapping("/FindGoodTwo")
    public ResultData<Map<String,Object>> FindGoodsTwo(){

        return  goodService.FindGoodsTwo();
    }

    @RequestMapping("/FindGoodRank")
    public ResultData<Map<String,Object>> FindGoodsRank(){

        return  goodService.FindGoodsRank();
    }

    /**
     * 给用户的
     * @param goods_id  商品的ID
     * @return  返回Map格式的数据
     */
    @RequestMapping("/FindGoodById")
    public ResultData<Map<String,Object>> FindGoodbyid(@RequestParam("goods_id") Integer goods_id){


        return  goodService.FindGoodbyid(goods_id);
    }

}
