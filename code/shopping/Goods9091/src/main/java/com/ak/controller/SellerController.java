package com.ak.controller;


import com.ak.Goods;
import com.ak.Impl.GoodsPerson;
import com.ak.OrderItem;
import com.ak.ResultData;
import com.ak.service.impl.GoodServiceImpl;
import com.ak.service.impl.SellerServiceImpl;
import com.ak.utils.FileUploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 卖家的 业务接口
 *
 */

@RestController
@RequestMapping("/Seller")
public class SellerController {

    private SellerServiceImpl sellerService;


    GoodServiceImpl goodService;

    @Autowired
    public void setGoodService(GoodServiceImpl goodService) {
        this.goodService = goodService;
    }


    @Autowired
    public void setSellerService(SellerServiceImpl sellerService) {
        this.sellerService = sellerService;
    }

    /**
     *
     * @param goods  商品的信息
     * @param file  图片的信息
     * @param request  请求
     * @return  返回添加信息
     */
    @RequestMapping("/Add")
    public ResultData<String> AddGoods( Goods goods, @RequestParam(value = "file") MultipartFile file, HttpServletRequest request){
        ResultData<String> data = new ResultData<>();
        System.out.println("添加商品" + goods);
        if (goods == null||goods.getSeller_id()<=0) {
            data.setCode(-1);
            data.setMessage("添加失败");
            data.setData("信息不完整");
        }else {
            goods.setSale(0);
            goods.setGoods_type(1);
            goods.setOriginal_price(0.0);
            if(file==null||file.isEmpty()){
                System.out.println("图片为空");
                goods.setBanner_img(null);
            }else{
                String file_name= FileUploadUtils.generateRandonFileName(file.getOriginalFilename());
                String filePath=System.getProperty("user.dir")+"\\src\\main\\resources\\upload\\"+file_name;
//                System.out.println(request.getServletContext().getRealPath("/"));
//                System.out.println(request.getSession().getServletContext().getRealPath("/"));
                File f = new File(filePath); // 不存在文件夹
                if(!f.getParentFile().exists()){
                    System.out.println("文件夹不存在");
                    f.getParentFile().mkdirs();
                }
                try {
                    file.transferTo(f);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                goods.setBanner_img(filePath);
            }
            int result=sellerService.AddGoods(goods);
            if(result>=1){
                data.setCode(200);
                data.setMessage("添加成功");
                data.setData("添加成功");
            }else{
                data.setCode(-1);
                data.setMessage("添加失败");
                data.setData("错误");
            }
        }
        return data;
    }

    /**
     *  修改商品信息
     * @param goods  商品信息
     * @param file   图片信息
     * @param request  请求资源
     * @return  返回修改信息
     */
    @RequestMapping("/Modify")
    public ResultData<String> ModifyGoods(Goods goods,@RequestParam(value = "file",required = false) MultipartFile file, HttpServletRequest request){

        ResultData<String> data = new ResultData<>();
        System.out.println("修改商品\n" + goods);
        if (goods == null||goods.getSell_price()<=0) {
            data.setCode(-1);
            data.setMessage("添加失败");
            data.setData("信息不完整");
        }else {

            GoodsPerson goodsPerson= goodService.FindGoodsById(goods.getGoods_id());
            goods.setGoods_type(goodsPerson.getGoods_type());
            goods.setSale(goods.getSale());
            goods.setSeller_id(goods.getSeller_id());
            if(file==null||file.isEmpty()){
                System.out.println("图片为空");
                goods.setBanner_img(null);
            }else{
                String file_name= FileUploadUtils.generateRandonFileName(file.getOriginalFilename());
                String filePath=System.getProperty("user.dir")+"\\src\\main\\resources\\upload\\"+file_name;
                File f = new File(filePath);

                // 不存在文件夹
                if(!f.getParentFile().exists()){
                    System.out.println("文件夹不存在");
                    f.getParentFile().mkdirs();
                }

                try {
                    file.transferTo(f);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                goods.setBanner_img(filePath);
            }
            int result=sellerService.ModifyGoods(goods);
            if(result>=1){
                data.setCode(200);
                data.setMessage("添加成功");
                data.setData("添加成功");
            }else{
                data.setCode(-1);
                data.setMessage("添加失败");
                data.setData("错误");
            }

        }
        return data;
    }

    /**
     * 查找账单
     * @param sell_id
     * @return  返回账单
     */
    @RequestMapping("/FindBill")
    public ResultData<List<OrderItem>> FindBill(int sell_id){
        List<OrderItem> orderItems =sellerService.FindBill(sell_id);

        ResultData<List<OrderItem>> data=new ResultData<>();
        if(orderItems !=null&& orderItems.size()>0){
            data.setMessage("添加商品成功");
            data.setData(orderItems);
            data.setCode(200);
            return data;
        }else {
            data.setMessage("添加商品失败");
            data.setData(null);
            data.setCode(-1);
            return data;
        }
    }

    /**
     * 这个是 商家端口 ，
     * @param seller_id 商家的 id
     * @return 返回商家所拥有的商品
     */
    @RequestMapping("/FindGoodBySellId")
    public ResultData<Map<String,Object>> FindGoodbySellId(int seller_id){
        Map<String,Object> map=new HashMap<>();
        ResultData<Map<String,Object>> data=new ResultData<>();
        data.setCode(200);
        data.setMessage("返回 find One");
        map.put("Goods",goodService.FindGoodsBySellId(seller_id));
        data.setData(map);
        return  data;
    }
}
