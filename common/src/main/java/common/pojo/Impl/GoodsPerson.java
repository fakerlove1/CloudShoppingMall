package common.pojo.Impl;

import common.pojo.Goods;
import common.pojo.Person;

public class GoodsPerson extends Goods {
     Person person;

    public GoodsPerson(Person person) {
        this.person = person;
    }

    public GoodsPerson(int goods_id, String goods_name, int goods_type, String seller_name, String banner_img, String priviewInformation, Double sell_price, Double original_price, int surplus, int sale, Person person) {
        super(goods_id, goods_name, goods_type, seller_name, banner_img, priviewInformation, sell_price, original_price, surplus, sale);
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
