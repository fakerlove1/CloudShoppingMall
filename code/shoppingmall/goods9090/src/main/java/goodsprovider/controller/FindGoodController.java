package goodsprovider.controller;

import common.pojo.Impl.GoodsPerson;
import common.pojo.ResultData;
import goodsprovider.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 发现商品
 */
@Controller
@RequestMapping("/good")
public class FindGoodController {

    @Autowired
    GoodServiceImpl goodService;

    /**
     * 首页 商品 第一排
     * @return
     */
    @RequestMapping("")
    @ResponseBody
    public ResultData<String> findByOne(){
        return null;
    }

    @RequestMapping("/findgoodone")
    public ResultData<List<GoodsPerson>> FindGoodsOne(){

        ResultData<List<GoodsPerson>> data=new ResultData<>();
        data.setCode(200);
        data.setMessage("返回 find One");
        data.setData(goodService.FindGoodOne());
        return  data;
    }

    @RequestMapping("/findgoodtwo")
    public ResultData<List<GoodsPerson>> FindGoodsTwo(){
        ResultData<List<GoodsPerson>> data=new ResultData<>();
        data.setCode(200);
        data.setMessage("返回 find Two");
        data.setData(goodService.FindGoodTwo());
        return  data;
    }

    @RequestMapping("/findgoodrank")
    public ResultData<List<GoodsPerson>> FindGoodsRank(){
        ResultData<List<GoodsPerson>> data=new ResultData<>();
        data.setCode(200);
        data.setMessage("返回 find Rank");
        data.setData(goodService.FindGoodRank());
        return  data;
    }


}
