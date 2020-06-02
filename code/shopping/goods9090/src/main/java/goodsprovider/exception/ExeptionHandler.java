package goodsprovider.exception;

import common.pojo.ResultData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 自定义异常处理类
 */
@RestControllerAdvice //通知将异常返回一个字符串类型 下面两个的 合并  自定义运行
public class ExeptionHandler {


    /**
     * 捕获全局异常信息，处理有可能发生的所有异常
     * @param exc
     * @param request
     * @return
     */
    @ExceptionHandler(value = Exception.class)//捕获一个父类异常Exception
    public ResultData<Map<String,Object>> handlerExce(Exception exc, HttpServletRequest request){
        System.out.println(exc.getMessage());
        ResultData<Map<String,Object>> data=new ResultData<>();
        Map<String,Object> map = new HashMap<>();
        map.put("msg",exc.getMessage()); //拿到异常信息
        data.setCode(-1);
        data.setMessage("服务器异常，请稍后访问");
        data.setData(map);
        return data;
    }
}
