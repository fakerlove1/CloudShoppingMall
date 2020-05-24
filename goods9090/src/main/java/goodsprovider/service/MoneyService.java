package goodsprovider.service;

import common.pojo.Person;

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

}
