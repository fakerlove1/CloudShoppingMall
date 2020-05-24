package common.pojo;


/**
 *  返回结果
 * @param <T>
 */

public class ResultData<T>{
    private String message;
    private int code;
    private T data;

    public ResultData() {
    }

    public ResultData(String message, int code, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResultData(int code, String message){
        this(message,code,null);
    }
}
