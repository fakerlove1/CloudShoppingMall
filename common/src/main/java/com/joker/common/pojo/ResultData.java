package com.joker.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  返回结果
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultData<T>{
    private String message;
    private int code;
    private T data;

    public ResultData(int code,String message){
        this(message,code,null);
    }
}
