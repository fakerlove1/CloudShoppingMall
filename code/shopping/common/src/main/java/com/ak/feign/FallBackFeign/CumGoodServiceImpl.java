package com.ak.feign.FallBackFeign;

import com.ak.Goods;
import com.ak.Impl.Buy;
import com.ak.OrderItem;
import com.ak.ResultData;
import com.ak.Shoppingcar;
import com.ak.feign.GoodService;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 熔断器的兜底服务
 */
@Component
public class CumGoodServiceImpl implements GoodService {
    @Override
    public ResultData<Map<String, Object>> FindGoodsOne() {

        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        map.put("message","对不起");
        data.setData(map);
        return  data;
    }

    @Override
    public ResultData<Map<String, Object>> FindGoodsTwo() {
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        map.put("message","对不起");
        data.setData(map);
        return  data;
    }

    @Override
    public ResultData<Map<String, Object>> FindGoodsRank() {
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        map.put("message","对不起");
        data.setData(map);
        return  data;
    }

    @Override
    public ResultData<Map<String, Object>> FindGoodbyid(Integer goods_id) {
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        map.put("message","对不起");
        data.setData(map);
        return  data;
    }

    @Override
    public ResultData<Map<String, Object>> buy(Buy buy) {
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        map.put("message","对不起");
        data.setData(map);
        return  data;
    }

    @Override
    public ResultData<String> transfer(Double money, int from, int to) {
//        Map<String,Object> map=new HashMap<>();
        ResultData<String> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        data.setData("对不起");
        return  data;
    }

    @Override
    public ResultData<Map<String, Object>> Add(Double money, int to) {
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        map.put("message","对不起");
        data.setData(map);
        return  data;
    }

    @Override
    public ResultData<Map<String, Object>> User(Integer user_id) {
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        map.put("message","对不起");
        data.setData(map);
        return  data;
    }

    @Override
    public ResultData<Map<String, Object>> shopping(Integer seller_id) {
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        map.put("message","对不起");
        data.setData(map);
        return  data;
    }

    @Override
    public ResultData<String> AddGoods(Goods goods, MultipartFile file, HttpServletRequest request) {
        ResultData<String> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        data.setData("对不起");
        return  data;
    }

    @Override
    public ResultData<String> ModifyGoods(Goods goods, MultipartFile file, HttpServletRequest request) {
        ResultData<String> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        data.setData("对不起");
        return  data;
    }

    @Override
    public ResultData<List<OrderItem>> FindBill(Integer sell_id) {
        return null;
    }

    @Override
    public ResultData<Map<String, Object>> FindGoodbySellId(Integer seller_id) {
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        map.put("message","对不起");
        data.setData(map);
        return  data;
    }

    @Override
    public ResultData<String> AddShoppingCar(Integer goods_id, Integer user_id, Integer number) {
        ResultData<String> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        data.setData("对不起");
        return  data;
    }

    @Override
    public ResultData<String> DeleteShoppingCar(Integer user_id, Integer goods_id) {
        ResultData<String> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        data.setData("对不起");
        return  data;
    }

    @Override
    public ResultData<List<Shoppingcar>> FindShoppingCar(Integer user_id) {
        return null;
    }

    @Override
    public ResultData<String> ModifyShoppingCar(Integer user_id, Integer goods_id, Integer number) {
        ResultData<String> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        data.setData("对不起");
        return  data;
    }
}
