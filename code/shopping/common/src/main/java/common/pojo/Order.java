package common.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {

    private int order_key;
    private String order_id;
    private int user_id;
    private Date order_time;
    private Double all_money;
}
