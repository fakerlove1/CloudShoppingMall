package personprovider8081;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 *  用户类
 */
@SpringBootApplication
@EnableEurekaClient
public class Person8081Application {

    public static void main(String[] args) {
        SpringApplication.run(Person8081Application.class, args);
    }

}
