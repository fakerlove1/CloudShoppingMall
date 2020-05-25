package common.pojo;

public class Shoppingcar {
    private int shoppingcar_key;
    private int goods_id;
    private int user_id;
    private int shopping_goodsnumber;
    private Double shopping_needmoney;

    public Shoppingcar(int shoppingcar_key, int goods_id, int user_id, int shopping_goodsnumber, Double shopping_needmoney) {
        this.shoppingcar_key = shoppingcar_key;
        this.goods_id = goods_id;
        this.user_id = user_id;
        this.shopping_goodsnumber = shopping_goodsnumber;
        this.shopping_needmoney = shopping_needmoney;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Shoppingcar{" +
                "shoppingcar_key=" + shoppingcar_key +
                ", goods_id=" + goods_id +
                ", user_name='" + user_id + '\'' +
                ", shopping_goodsnumber=" + shopping_goodsnumber +
                ", shopping_needmoney=" + shopping_needmoney +
                '}';
    }

    public Shoppingcar() {
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
