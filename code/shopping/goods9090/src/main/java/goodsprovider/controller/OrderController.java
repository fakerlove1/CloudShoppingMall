package goodsprovider.controller;

import common.pojo.Impl.OrderAll;
import common.pojo.Impl.OrderItems;
import common.pojo.OrderItem;
import common.pojo.ResultData;
import goodsprovider.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 账单的表现层
 */
@RestController
@RequestMapping("/Order")
public class OrderController {

    OrderServiceImpl orderService;

    @Autowired
    public void setOrderService(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    /**
     *
     * @param user_id 用户的id
     * @return 返回该用户的账单信息
     */
    @RequestMapping("/User")
    public ResultData<Map<String,Object>> User(int user_id){
        ResultData<Map<String,Object>> data=new ResultData<>();
        Map<String,Object> map=new HashMap<>();
        List<OrderAll> list=orderService.FindPersonOrder(user_id);

        if(list==null){
            data.setCode(-1);
            data.setMessage("账单为空，或者其他原因");
            map.put("message","对不起查找失败");
            data.setData(map);
        }else{
            data.setCode(200);
            data.setMessage("成功");
            map.put("order",list);
            data.setData(map);
        }
        return data;
    }

    /**
     *
     * @param seller_id  商家的id
     * @return 返回 商家账单信息
     */
    @RequestMapping("/Shopping")
    public ResultData<Map<String,Object>> shopping(int seller_id){
        ResultData<Map<String,Object>> data=new ResultData<>();
        Map<String,Object> map=new HashMap<>();
        List<OrderItems> list=orderService.FindShoppingOrder(seller_id);
        if(list==null){
            data.setCode(-1);
            data.setMessage("账单为空，或者其他原因");
            map.put("message","对不起查找失败");
            data.setData(map);
        }else{
            data.setCode(200);
            data.setMessage("成功");
            map.put("order",list);
            data.setData(map);
        }
        return data;
    }

}
