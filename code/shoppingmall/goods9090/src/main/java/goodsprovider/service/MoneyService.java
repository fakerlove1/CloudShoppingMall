package goodsprovider.service;

import common.pojo.BuyGood;
import common.pojo.Person;
import common.pojo.ResultData;

/**
 * 商品的 只有转账
 */
public interface MoneyService {

    /**
     * 转账 业务
     * @param money
     * @param from
     * @param to
     * @return
     */
    int ModifyMoney(Double money,int from,int to);


    ResultData<String> BuyGoods(BuyGood[] buyGoods, int user_id);

}
