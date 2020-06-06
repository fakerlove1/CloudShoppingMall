package com.ak.controller.goods;

import com.ak.feign.GoodService;
import com.ak.ResultData;
import com.ak.Shoppingcar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 购物车 的Controller 层
 *
 */
@RestController
@RequestMapping("/ShoppingCar")
public class ShoppingCarController {


    GoodService goodService;

    @Autowired
    public void setGoodService(GoodService goodService) {
        this.goodService = goodService;
    }


    @RequestMapping("/Add")
    public ResultData<String> AddShoppingCar(@RequestParam("goods_id") Integer goods_id, @RequestParam("user_id") Integer user_id, @RequestParam("number")Integer number){
       return goodService.AddShoppingCar(goods_id,user_id,number);
    }

    /**
     * 删除购物车
     * @param user_id  用户 的id
     * @param goods_id 商品 的id
     * @return  是否删除成功
     */
    @RequestMapping("/Delete")
    public ResultData<String> DeleteShoppingCar(@RequestParam("user_id") Integer user_id,@RequestParam("goods_id")Integer goods_id){
       return goodService.DeleteShoppingCar(user_id,goods_id);
    }

    /**
     * 返回当前用户的所有购物车
     * @param user_id  用户的id
     * @return 购物车
     */
    @RequestMapping("/Find")
    public ResultData<List<Shoppingcar>> FindShoppingCar(@RequestParam("user_id") Integer user_id){
       return goodService.FindShoppingCar(user_id);
    }


    /**
     * 修改购物车的数量
     * @param user_id  用户的id
     * @param goods_id 商品的 id
     * @param number  需要修改的数量
     * @return 是否修改成功
     */
    @RequestMapping("/Modify")
    public ResultData<String> ModifyShoppingCar(@RequestParam("user_id") Integer user_id,@RequestParam("goods_id") Integer goods_id,@RequestParam("number") Integer number){
        return goodService.ModifyShoppingCar(user_id,goods_id,number);
    }


}
