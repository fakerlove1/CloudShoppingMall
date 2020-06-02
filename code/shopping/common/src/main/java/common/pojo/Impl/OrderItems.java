package common.pojo.Impl;

import common.pojo.Order;
import common.pojo.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class OrderItems {

    private int orderitem_key;
    private String order_id;
    private int goods_id;
    private int seller_id;
    private int buy_number;
    private Double item_money;

    private Order order;
    private Person person;


}
