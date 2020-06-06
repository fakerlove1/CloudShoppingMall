package com.ak.feign;

import com.ak.Goods;
import com.ak.Impl.Buy;
import com.ak.OrderItem;
import com.ak.ResultData;
import com.ak.Shoppingcar;
import com.ak.feign.FallBackFeign.CumGoodServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Component
@FeignClient(value = "GOODS",fallback = CumGoodServiceImpl.class)
public interface GoodService {

    @RequestMapping("/Good/FindGoodOne")
    public ResultData<Map<String,Object>> FindGoodsOne();

    @RequestMapping("/Good/FindGoodTwo")
    public ResultData<Map<String,Object>> FindGoodsTwo();

    @RequestMapping("/Good/FindGoodRank")
    public ResultData<Map<String,Object>> FindGoodsRank();

    @RequestMapping("/Good/FindGoodById")
    public ResultData<Map<String,Object>> FindGoodbyid(@RequestParam("goods_id") Integer goods_id);


    @RequestMapping("/Money/Buy")
    ResultData<Map<String, Object>> buy(@RequestBody Buy buy);

    @RequestMapping("/Money/Tranfer")
    ResultData<String> transfer(@RequestParam("money") Double money, @RequestParam("from") int from, @RequestParam("to") int to);

    @RequestMapping("/Money/Add")
    ResultData<Map<String, Object>> Add(@RequestParam("money")Double money, @RequestParam("to")int to);


    @RequestMapping("/Order/User")
    public ResultData<Map<String,Object>> User(@RequestParam("user_id") Integer user_id);


    @RequestMapping("/Order/Shopping")
    public ResultData<Map<String,Object>> shopping(@RequestParam("seller_id")Integer seller_id);



    @RequestMapping("/Seller/Add")
    public ResultData<String> AddGoods(Goods goods, @RequestParam(value = "file") MultipartFile file, @RequestParam(value = "request") HttpServletRequest request);

    @RequestMapping("/Seller/Modify")
    public ResultData<String> ModifyGoods(Goods goods,@RequestParam(value = "file",required = false) MultipartFile file,@RequestParam(value = "request") HttpServletRequest request);

    @RequestMapping("/Seller/FindBill")
    public ResultData<List<OrderItem>> FindBill(@RequestParam("seller_id") Integer sell_id);

    @RequestMapping("/Seller/FindGoodBySellId")
    public ResultData<Map<String,Object>> FindGoodbySellId(@RequestParam("seller_id")Integer seller_id);


    @RequestMapping("/ShoppingCar/Add")
    public ResultData<String> AddShoppingCar(@RequestParam("goods_id") Integer goods_id, @RequestParam("user_id") Integer user_id, @RequestParam("number")Integer number);

    @RequestMapping("/ShoppingCar/Delete")
    public ResultData<String> DeleteShoppingCar(@RequestParam("user_id")Integer user_id,@RequestParam("goods_id") Integer goods_id);

    @RequestMapping("/ShoppingCar/Find")
    public ResultData<List<Shoppingcar>> FindShoppingCar(@RequestParam("user_id") Integer user_id);

    @RequestMapping("/ShoppingCar/Modify")
    public ResultData<String> ModifyShoppingCar(@RequestParam("user_id") Integer user_id,@RequestParam("goods_id") Integer goods_id,@RequestParam("number") Integer number);


}
