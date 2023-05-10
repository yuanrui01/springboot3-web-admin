package com.hypnos.springboot3webadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class, RedisAutoConfiguration.class})
public class Springboot3WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3WebAdminApplication.class, args);
    }

}
