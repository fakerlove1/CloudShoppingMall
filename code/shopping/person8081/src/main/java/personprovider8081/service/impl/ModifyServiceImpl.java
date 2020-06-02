package personprovider8081.service.impl;

import common.pojo.Person;
import common.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personprovider8081.mapper.PersonMapper;
import personprovider8081.service.ModifyService;

@Service
public class ModifyServiceImpl implements ModifyService {

    @Autowired
    PersonMapper personMapper;

    /**
     * 修改用户信息,根据 id 来进行修复 ,person 肯定不为空
     * @param person
     * @return
     */
    @Override
    public ResultData<String> ModifyPerson(Person person) {
        System.out.println("service 层"+person);
        ResultData<String> data=new ResultData<>();

        Person result=personMapper.FindPersonById(person.getUser_id());
        if(result==null||result.getUser_id()==0){
            data.setCode(-1);
            data.setMessage("修改失败");
            data.setData("对不起查无此人，没有此ID");
        }else{
            int res= personMapper.ModifyPerson(person);
            if(res>0){
                data.setCode(200);
                data.setMessage("修改成功");
                data.setData("修改成功了");
            }else {
                data.setCode(-1);
                data.setMessage("修改失败");
                data.setData("对不起数据格式有误");
            }
        }
        return data;
    }

    /**
     * 添加 用户信息
     * @param person
     * @return
     */
    @Override
    public ResultData<Integer> AddPerson(Person person) {

        ResultData<Integer> data=new ResultData<>();
        int res= personMapper.AddPerson(person);
        if(res>0){
            res=personMapper.findid();
        }
        //res 返回的主键
        if(res<1){
            data.setData(-1);
            data.setMessage("新添用户失败");
            data.setCode(-1);
        }else {
            data.setData(res);
            data.setMessage("添加用户成功");
            data.setCode(200);
        }
        return data;
    }


}
