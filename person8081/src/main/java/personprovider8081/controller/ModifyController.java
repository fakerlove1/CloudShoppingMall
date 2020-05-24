package personprovider8081.controller;


import common.pojo.Person;
import common.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import personprovider8081.mapper.PersonMapper;
import personprovider8081.service.ModifyService;
import personprovider8081.service.impl.ModifyServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * 这里的修改信息的地方,
 * 删除用户的 地方
 */
@Controller
@RequestMapping("/person")
public class ModifyController {

    @Autowired
    ModifyServiceImpl modifyService;

    /**
     * @param person
     * @return
     */
    @RequestMapping("/modify")
    @ResponseBody
    public ResultData<String> modify(Person person, MultipartFile file, HttpServletRequest request) {

        ResultData<String> data = new ResultData<>();
        System.out.println("modify\n" + person);
        if (person == null || person.getUser_id() <= 0) {
            data.setCode(-1);
            data.setMessage("修改失败");
            data.setData("信息不完整");
            if(file.isEmpty()){
                person.setUser_banner_img(null);
            }else{

                String URL=request.getServletContext().getRealPath("/upload")+file.getOriginalFilename();
                System.out.println(URL);
                File f = new File(URL);
                try {
                    file.transferTo(f);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            return modifyService.ModifyPerson(person);
        }
        return data;
    }


    /**
     * 添加用户信息
     *
     * @param person
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public ResultData<Integer> add(@RequestBody Person person) {
        ResultData<Integer> data = new ResultData<>();
        System.out.println("add\n" + person);

        try {
            if (check(person)) {
                data.setCode(-1);
                data.setMessage("修改失败");
                data.setData(-1);
            } else {
                person.setUser_money(0.0);
                return modifyService.AddPerson(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    /**
     * 检查用户信息是否完整
     *
     * @param person
     * @return
     */
    public Boolean check(Person person) {

        if (person == null) {
            return true;
        }
        if (person.getUser_name() == null || person.getUser_name() == "") {
            return true;
        }

        if (!(person.getUser_gender() == 1 || person.getUser_gender() == 0)) {
            return true;
        }
        if (!(person.getUser_lev() == 1 || person.getUser_lev() == 2)) {
            return true;
        }
        return false;
    }


}
