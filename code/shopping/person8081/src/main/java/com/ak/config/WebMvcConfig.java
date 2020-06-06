package com.ak.config;;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

import javax.annotation.Resource;

/**
 * 支持跨域
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("注册了");
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT","PATCH")
                .maxAge(3600);
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

       registry.addResourceHandler("/upload/**").
               addResourceLocations("classpath:/upload/");
        super.addResourceHandlers(registry);
    }

//
//    @Resource
//    private BaseInterceptor baseInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//
//        System.out.println("peizhi");
//        registry.addInterceptor(baseInterceptor)
//                //需要配置2：----------- 告知拦截器：/static/admin/** 与 /static/user/** 不需要拦截 （配置的是 路径）
//                .excludePathPatterns("/upload/**");
//        super.addInterceptors(registry);
//    }
}
