package com.joker.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  是 用户的 信息
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private int user_id;
    private String user_name;
    private String user_password;
    private Double user_money;
    private int user_lev;
    private String user_email;
    private String user_address;
    private String user_banner_img;
    private String user_telephone;
    private String user_introduce;

}
