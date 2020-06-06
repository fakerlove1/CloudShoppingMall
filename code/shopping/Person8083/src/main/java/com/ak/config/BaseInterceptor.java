package com.ak.config;//package personprovider8081.config;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//@Component
//public class BaseInterceptor extends HandlerInterceptorAdapter {
//
//	private final Logger logger = LoggerFactory.getLogger(BaseInterceptor.class);
//
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		logger.info(request.getRequestURI());
//		System.out.println("logg");
//		return super.preHandle(request, response, handler);
//	}
//
//	@Override
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//		logger.info(request.getRequestURI());
//		super.afterCompletion(request, response, handler, ex);
//	}
//}