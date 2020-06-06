package com.ak.feign;

import com.ak.Person;
import com.ak.ResultData;
import com.ak.feign.FallBackFeign.CumLoginImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.util.List;

@Component
@FeignClient(value = "PERSON",fallback = CumLoginImpl.class)
public interface LoginService {

    @RequestMapping("/Person/Login")
    public ResultData<Person> login(@RequestParam("user_id") Integer user_id, @RequestParam("user_password") String user_password);

    @RequestMapping("/Person/FindAll")
    public ResultData<List<Person>> findall(@RequestParam("user_lev") Integer user_lev);

    @RequestMapping("/Person/Modify")
    ResultData<String> modify(@RequestParam("person") Person person, @RequestParam(value = "file",required = false) MultipartFile file, @RequestParam("request") HttpServletRequest request) throws FileNotFoundException;

    @RequestMapping("/Person/Add")
    public ResultData<Integer> add(@RequestBody Person person);

    @RequestMapping("/person/addmoney")
    public ResultData<String> addmoney(@RequestParam("money") Double money, @RequestParam("user_id") Integer user_id);

}
