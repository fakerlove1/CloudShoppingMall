package common.pojo.Impl;

import common.pojo.OrderItem;

import java.sql.Date;
import java.util.List;

/**
 * 用户的订单表
 *
 */
public class OrderAll {

    private int order_key;
    private String order_id;
    private int user_id;
    private Date order_time;
    private Double all_money;
    private List<OrderItem> orderItems;

    public OrderAll() {
    }

    public OrderAll(int order_key, String order_id, int user_id, Date order_time, Double all_money, List<OrderItem> orderItems) {
        this.order_key = order_key;
        this.order_id = order_id;
        this.user_id = user_id;
        this.order_time = order_time;
        this.all_money = all_money;
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "OrderAll{" +
                "order_key=" + order_key +
                ", order_id='" + order_id + '\'' +
                ", user_id=" + user_id +
                ", order_time=" + order_time +
                ", all_money=" + all_money +
                ", orderitems=" + orderItems +
                '}';
    }

    public int getOrder_key() {
        return order_key;
    }

    public void setOrder_key(int order_key) {
        this.order_key = order_key;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public Double getAll_money() {
        return all_money;
    }

    public void setAll_money(Double all_money) {
        this.all_money = all_money;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
