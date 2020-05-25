package personprovider8081.service.impl;

import common.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.stereotype.Service;
import personprovider8081.mapper.PersonMapper;
import personprovider8081.service.MoneyService;

@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private PersonMapper personMapper;

    /**
     * 充值业务
     * @param money
     * @param user_id
     * @return
     */
    @Override
    public int AddMoney(Double money, int user_id) {
        Person person=personMapper.FindPersonById(user_id);
        if(person==null||person.getUser_money()<=0){
            return  -1;
        }else {
           return personMapper.AddMoney(person.getUser_money()+money,user_id);
        }
    }

    /**
     * 扣钱业务
     * @param money
     * @param user_id
     * @return
     */
    @Override
    public int MinMoney(Double money, int user_id) {
        return 0;
    }


}
