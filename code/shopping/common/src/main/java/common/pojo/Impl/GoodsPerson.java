package common.pojo.Impl;


import common.pojo.Person;

public class GoodsPerson {
    private Person person;
    private int goods_id;
    private String goods_name;
    private int goods_type;
    private int  seller_id;
    private String banner_img;
    private String priviewInformation;
    private Double sell_price;
    private Double original_price;
    private int surplus;
    private int sale;

    @Override
    public String toString() {
        return "GoodsPerson{" +
                "person=" + person +
                ", goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_type=" + goods_type +
                ", seller_id=" + seller_id +
                ", banner_img='" + banner_img + '\'' +
                ", priviewInformation='" + priviewInformation + '\'' +
                ", sell_price=" + sell_price +
                ", original_price=" + original_price +
                ", surplus=" + surplus +
                ", sale=" + sale +
                '}';
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public GoodsPerson(Person person, int goods_id, String goods_name, int goods_type, int seller_id, String banner_img, String priviewInformation, Double sell_price, Double original_price, int surplus, int sale) {
        this.person = person;
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_type = goods_type;
        this.seller_id = seller_id;
        this.banner_img = banner_img;
        this.priviewInformation = priviewInformation;
        this.sell_price = sell_price;
        this.original_price = original_price;
        this.surplus = surplus;
        this.sale = sale;
    }

    public GoodsPerson() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(int goods_type) {
        this.goods_type = goods_type;
    }



    public String getBanner_img() {
        return banner_img;
    }

    public void setBanner_img(String banner_img) {
        this.banner_img = banner_img;
    }

    public String getPriviewInformation() {
        return priviewInformation;
    }

    public void setPriviewInformation(String priviewInformation) {
        this.priviewInformation = priviewInformation;
    }

    public Double getSell_price() {
        return sell_price;
    }

    public void setSell_price(Double sell_price) {
        this.sell_price = sell_price;
    }

    public Double getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(Double original_price) {
        this.original_price = original_price;
    }

    public int getSurplus() {
        return surplus;
    }

    public void setSurplus(int surplus) {
        this.surplus = surplus;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }
}
