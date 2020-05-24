package goodsprovider.service.impl;

import common.pojo.Person;
import goodsprovider.mapper.PersonMapper;
import goodsprovider.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;

public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private PersonMapper personMapper;


    /**
     * 转钱业务
     * @param money
     * @param from
     * @param to
     * @return
     */
    @Override
    public int ModifyMoney(Double money, int from, int to) {
        Person p_from=personMapper.FindPersonById(from);
        Person p_to=personMapper.FindPersonById(to);
        /**
         * 两个用户不在
         */
        if(p_from==null||p_from==null){

            return -1;
        }
        /**
         * 表示 from 余额不足
         */
        if(p_from.getUser_money()<money){
            return -1;
        }
        int res1=personMapper.AddMoney(p_from.getUser_money()-money,from);
        int res2=personMapper.AddMoney(p_to.getUser_money()+money,to);
        /**
         * 转账过程中发现问题
         */
        if(res1<=0||res2<=0){
            return -1;
        }
        return 1 ;
    }
}
