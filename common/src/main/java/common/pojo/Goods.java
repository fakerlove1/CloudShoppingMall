package common.pojo;




/**
 * 商品信息
 *
 */


public class Goods {
    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_type=" + goods_type +
                ", seller_name='" + seller_name + '\'' +
                ", banner_img='" + banner_img + '\'' +
                ", priviewInformation='" + priviewInformation + '\'' +
                ", sell_price=" + sell_price +
                ", original_price=" + original_price +
                ", surplus=" + surplus +
                ", sale=" + sale +
                '}';
    }

    private int goods_id;
    private String goods_name;
    private int goods_type;
    private String seller_name;
    private String banner_img;
    private String priviewInformation;
    private Double sell_price;
    private Double original_price;
    private int surplus;
    private int sale;

    public Goods() {
    }

    public Goods(int goods_id, String goods_name, int goods_type, String seller_name, String banner_img, String priviewInformation, Double sell_price, Double original_price, int surplus, int sale) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_type = goods_type;
        this.seller_name = seller_name;
        this.banner_img = banner_img;
        this.priviewInformation = priviewInformation;
        this.sell_price = sell_price;
        this.original_price = original_price;
        this.surplus = surplus;
        this.sale = sale;
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

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
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
