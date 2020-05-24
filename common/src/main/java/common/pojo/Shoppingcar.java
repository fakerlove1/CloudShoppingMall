package common.pojo;




public class Shoppingcar {
    private int shoppingcar_key;
    private int goods_id;
    private String user_name;
    private int shopping_goodsnumber;
    private Double shopping_needmoney;

    public Shoppingcar() {
    }

    public Shoppingcar(int shoppingcar_key, int goods_id, String user_name, int shopping_goodsnumber, Double shopping_needmoney) {
        this.shoppingcar_key = shoppingcar_key;
        this.goods_id = goods_id;
        this.user_name = user_name;
        this.shopping_goodsnumber = shopping_goodsnumber;
        this.shopping_needmoney = shopping_needmoney;
    }

    public int getShoppingcar_key() {
        return shoppingcar_key;
    }

    public void setShoppingcar_key(int shoppingcar_key) {
        this.shoppingcar_key = shoppingcar_key;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getShopping_goodsnumber() {
        return shopping_goodsnumber;
    }

    public void setShopping_goodsnumber(int shopping_goodsnumber) {
        this.shopping_goodsnumber = shopping_goodsnumber;
    }

    public Double getShopping_needmoney() {
        return shopping_needmoney;
    }

    public void setShopping_needmoney(Double shopping_needmoney) {
        this.shopping_needmoney = shopping_needmoney;
    }
}
