package com.ak.feign.FallBackFeign;

import com.ak.Person;
import com.ak.ResultData;
import com.ak.feign.LoginService;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * 熔断器的兜服务
 */
@Component
public class CumLoginImpl implements LoginService {
    @Override
    public ResultData<Person> login(Integer user_id, String user_password) {
        return null;
    }

    @Override
    public ResultData<List<Person>> findall(Integer user_lev) {
        ResultData<List<Person>> resultData=new ResultData<>();
        resultData.setCode(-1);
        resultData.setMessage("对不起服务找不到");
        resultData.setData(null);
        return null;
    }

    @Override
    public ResultData<String> modify(Person person, MultipartFile file, HttpServletRequest request) throws FileNotFoundException {
        ResultData<String> data=new ResultData<>();
        data.setCode(-1);
        data.setMessage("对不起服务揣出现问题");
        data.setData("对不起");
        return  data;
    }

    @Override
    public ResultData<Integer> add(Person person) {
        return null;
    }

    @Override
    public ResultData<String> addmoney(Double money, Integer user_id) {
        return null;
    }
}
