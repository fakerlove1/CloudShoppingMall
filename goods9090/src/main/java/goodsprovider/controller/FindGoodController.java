package goodsprovider.controller;

import common.pojo.Impl.GoodsPerson;
import common.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 发现商品
 */
@Controller
@RequestMapping("/good")
public class FindGoodController {

    @Autowired


    @RequestMapping("/findgoodone")
    public ResultData<List<GoodsPerson>> FindGoodsOne(){

    }
}
