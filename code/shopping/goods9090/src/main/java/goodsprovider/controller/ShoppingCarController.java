package goodsprovider.controller;

import common.pojo.ResultData;
import common.pojo.Shoppingcar;
import goodsprovider.service.impl.ShoppingCarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 购物车 的Controller 层
 *
 */
@RestController
@RequestMapping("/ShoppingCar")
public class ShoppingCarController {


    ShoppingCarServiceImpl shoppingCarService;

    @Autowired
    public void setShoppingCarService(ShoppingCarServiceImpl shoppingCarService) {
        this.shoppingCarService = shoppingCarService;
    }

    /**
     * 添加购物车
     * @param goods_id  商品的id
     * @param user_id   用户的id
     * @return  是否添加成功
     */
    @RequestMapping("/Add")
    public ResultData<String> AddShoppingCar(int goods_id,int user_id,int number){
        int result=shoppingCarService.AddShoppingCar(goods_id,user_id,number);

        ResultData<String> data=new ResultData<>();
        if(result>0){
            data.setMessage("添加购物车成功");
            data.setData("成功");
            data.setCode(200);
            return data;
        }else {
            data.setMessage("添加购物车失败");
            data.setData("失败");
            data.setCode(-1);
            return data;
        }
    }

    /**
     * 删除购物车
     * @param user_id  用户 的id
     * @param goods_id 商品 的id
     * @return  是否删除成功
     */
    @RequestMapping("/Delete")
    public ResultData<String> DeleteShoppingCar(int user_id,int goods_id){
        int result=shoppingCarService.DeleteShoppingCar(user_id,goods_id);

        ResultData<String> data=new ResultData<>();
        if(result>0){
            data.setMessage("删除购物车成功");
            data.setData("成功");
            data.setCode(200);
            return data;
        }else {
            data.setMessage("删除购物车失败");
            data.setData("失败");
            data.setCode(-1);
            return data;
        }
    }

    /**
     * 返回当前用户的所有购物车
     * @param user_id  用户的id
     * @return 购物车
     */
    @RequestMapping("/Find")
    public ResultData<List<Shoppingcar>> FindShoppingCar(int user_id){
        List<Shoppingcar> shoppingcars=shoppingCarService.SelectShoppingCar(user_id);
        ResultData<List<Shoppingcar>> data=new ResultData<>();
        if(shoppingcars!=null&&shoppingcars.size()>0){
            data.setMessage("查找购物车成功");
            data.setData(shoppingcars);
            data.setCode(200);
            return data;
        }else {
            data.setMessage("查找购物车失败");
            data.setData(null);
            data.setCode(-1);
            return data;
        }
    }


    /**
     * 修改购物车的数量
     * @param user_id  用户的id
     * @param goods_id 商品的 id
     * @param number  需要修改的数量
     * @return 是否修改成功
     */
    @RequestMapping("/Modify")
    public ResultData<String> ModifyShoppingCar(int user_id,int goods_id,int number){

        int result=shoppingCarService.ModifyShoppingCar(user_id,goods_id,number);

        ResultData<String> data=new ResultData<>();
        if(result>0){
            data.setMessage("修改购物车成功");
            data.setData("成功");
            data.setCode(200);
            return data;
        }else {
            data.setMessage("修改购物车失败");
            data.setData("失败");
            data.setCode(-1);
            return data;
        }
    }


}
