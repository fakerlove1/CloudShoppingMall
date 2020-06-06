package com.ak.controller;

import com.ak.ResultData;
import com.ak.service.impl.GoodServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回商品信息的类
 *  首页商品信息类
 *
 */
@RestController
@RequestMapping("/Good")
@Slf4j
public class GoodController {

    private final Logger logger = LoggerFactory.getLogger(GoodController.class);

    GoodServiceImpl goodService;

    @Autowired
    public void setGoodService(GoodServiceImpl goodService) {
        this.goodService = goodService;
    }

    @RequestMapping("/FindGoodOne")
    public ResultData<Map<String,Object>> FindGoodsOne(){
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(200);
        data.setMessage("返回 find One");
        map.put("goods",goodService.FindGoodOne());
        data.setData(map);
        return  data;
    }

    @RequestMapping("/FindGoodTwo")
    public ResultData<Map<String,Object>> FindGoodsTwo(){
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(200);
        data.setMessage("返回 find Two");
        map.put("goods",goodService.FindGoodTwo());
        data.setData(map);
        return  data;
    }

    @RequestMapping("/FindGoodRank")
    public ResultData<Map<String,Object>> FindGoodsRank(){
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(200);
        data.setMessage("返回 find Rank");
        map.put("goods",goodService.FindGoodRank());
        data.setData(map);
        return  data;
    }

    /**
     * 给用户的
     * @param goods_id  商品的ID
     * @return  返回Map格式的数据
     */
    @RequestMapping("/FindGoodById")
    public ResultData<Map<String,Object>> FindGoodbyid(@RequestParam("goods_id") int goods_id){
        logger.info("测试  "+goods_id);
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(200);
        data.setMessage("返回 商品的信息");
        map.put("GoodsPerson",goodService.FindGoodsById(goods_id));
        data.setData(map);
        return  data;
    }

}
