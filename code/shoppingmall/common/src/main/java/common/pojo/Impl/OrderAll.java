package common.pojo.Impl;

import common.pojo.Order;
import common.pojo.Orderitem;
import common.pojo.Person;

import java.sql.Date;
import java.util.List;

/**
 * 用户的订单表
 *
 */
public class OrderAll extends Order {

    private List<Orderitem> orderitems;



    public OrderAll(List<Orderitem> orderitems) {
        this.orderitems = orderitems;
    }

    public OrderAll(int order_key, String order_id, String user_name, Date order_time, Double all_money, List<Orderitem> orderitems) {
        super(order_key, order_id, user_name, order_time, all_money);
        this.orderitems = orderitems;
    }

    public OrderAll() {
    }


    public List<Orderitem> getOrderitems() {
        return orderitems;
    }

    public void setOrderitems(List<Orderitem> orderitems) {
        this.orderitems = orderitems;
    }

}
