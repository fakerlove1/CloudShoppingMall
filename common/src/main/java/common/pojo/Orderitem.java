package common.pojo;




/**
 * 订单  子项
 */

public class Orderitem {
    private int orderitem_key;
    private String order_id;
    private int goods_id;
    private String seller_name;
    private int buy_number;
    private Double item_money;

    public Orderitem() {
    }

    public Orderitem(int orderitem_key, String order_id, int goods_id, String seller_name, int buy_number, Double item_money) {
        this.orderitem_key = orderitem_key;
        this.order_id = order_id;
        this.goods_id = goods_id;
        this.seller_name = seller_name;
        this.buy_number = buy_number;
        this.item_money = item_money;
    }

    public int getOrderitem_key() {
        return orderitem_key;
    }

    public void setOrderitem_key(int orderitem_key) {
        this.orderitem_key = orderitem_key;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public int getBuy_number() {
        return buy_number;
    }

    public void setBuy_number(int buy_number) {
        this.buy_number = buy_number;
    }

    public Double getItem_money() {
        return item_money;
    }

    public void setItem_money(Double item_money) {
        this.item_money = item_money;
    }
}
