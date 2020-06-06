package com.ak.controller.goods;


import com.ak.feign.GoodService;
import com.ak.Goods;
import com.ak.OrderItem;
import com.ak.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 卖家的 业务接口
 *
 */

@RestController
@RequestMapping("/Seller")
public class SellerController {


    GoodService goodService;

    @Autowired
    public void setGoodService(GoodService goodService) {
        this.goodService = goodService;
    }


    @RequestMapping("/Add")
    public ResultData<String> AddGoods( Goods goods, @RequestParam(value = "file") MultipartFile file, @RequestParam("request") HttpServletRequest request){
        return goodService.AddGoods(goods,file,request);
    }

    @RequestMapping("/Modify")
    public ResultData<String> ModifyGoods(Goods goods,@RequestParam(value = "file",required = false) MultipartFile file,@RequestParam("request") HttpServletRequest request){

        return goodService.ModifyGoods(goods,file,request);
    }

    @RequestMapping("/FindBill")
    public ResultData<List<OrderItem>> FindBill(@RequestParam("seller_id") Integer sell_id){
      return goodService.FindBill(sell_id);
    }

    @RequestMapping("/FindGoodBySellId")
    public ResultData<Map<String,Object>> FindGoodbySellId(@RequestParam("seller_id") Integer seller_id){

        return  goodService.FindGoodbySellId(seller_id);
    }
}
