package common.pojo;



import java.sql.Date;


public class Order {

    private int order_key;
    private String order_id;
    private String user_name;
    private Date order_time;
    private Double all_money;

    @Override
    public String toString() {
        return "Order{" +
                "order_key=" + order_key +
                ", order_id='" + order_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", order_time=" + order_time +
                ", all_money=" + all_money +
                '}';
    }

    public Order() {
    }

    public Order(int order_key, String order_id, String user_name, Date order_time, Double all_money) {
        this.order_key = order_key;
        this.order_id = order_id;
        this.user_name = user_name;
        this.order_time = order_time;
        this.all_money = all_money;
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

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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
}
