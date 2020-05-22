package com.joker.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class order {
    private int order_key;
    private String order_id;
    private String user_name;
    private Date order_time;
    private Double all_money;

}
