package goodsprovider.controller;

import common.pojo.BuyGood;
import common.pojo.ResultData;
import goodsprovider.service.impl.GoodServiceImpl;
import goodsprovider.service.impl.MoneyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 买商品的
 */
@Controller
@RequestMapping("/good")
public class BuyGoodController {


    @Autowired
    GoodServiceImpl goodService;

    @Autowired
    MoneyServiceImpl moneyService;


    /**
     * 购买商品
     * @param buyGoods 购买商品的数量
     * @param user_id  购买商品的 id
     * @return
     */
    @RequestMapping("/buy")
    @ResponseBody
    public ResultData<String> buy(BuyGood []buyGoods,Integer user_id){

        ResultData<String> data=new ResultData<>();


        return data;
    }


    /**
     * 给别人的转账窗口
     * @param money
     * @param from
     * @param to
     * @return
     */
    @RequestMapping("/transfer")
    @ResponseBody
    public ResultData<String> transfer(@RequestParam("money") Double money, @RequestParam("from") int  from, @RequestParam("to") int to){

        ResultData<String> data=new ResultData<>();
        int result=moneyService.ModifyMoney(money,from,to);
        if(result>0){
            data.setCode(200);
            data.setMessage("转账成功");
            data.setData("成功了");
        }else {
            data.setCode(-1);
            data.setMessage("转账失败");
            data.setData("对不起");
        }
        return data;
    }
}
