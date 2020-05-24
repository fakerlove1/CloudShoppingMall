package goodsprovider.controller;

import common.pojo.ResultData;
import goodsprovider.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 买商品的
 */
@Controller
@RequestMapping("/good")
public class BuyGoodController {


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

}
