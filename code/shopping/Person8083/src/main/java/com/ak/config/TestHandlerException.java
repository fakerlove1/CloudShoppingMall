package com.ak.config;//package personprovider8081.config;
//
//import common.pojo.ResultData;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * 异常处理 类
// */
//@Component
//public class TestHandlerException implements HandlerExceptionResolver {
//
//    @Override
//    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//
//       ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("500");
//        ResultData<String> data=new ResultData<>();
//        modelAndView.addObject("error","对不起有错误");
//        return modelAndView;
//    }
//}