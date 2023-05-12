package com.hypnos.springboot3webadmin;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@MapperScan("com.hypnos.springboot3webadmin.dao")
//@ImportAutoConfiguration({DruidDataSourceAutoConfigure.class})
public class Springboot3WebAdminApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Springboot3WebAdminApplication.class, args);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
