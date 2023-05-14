package com.hypnos.springboot3webadmin;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@Slf4j
@SpringBootTest
class Springboot3WebAdminApplicationTests {

/*    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void test() {
        Long count = jdbcTemplate.queryForObject("select count(*) from t_fruit", Long.class);
        log.info("记录总数：{}", count);
    }*/

/*    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    void testRedis(){
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();

        operations.set("996", "翻车科技");
        String s = operations.get("996");
        System.out.printf(s);
    }*/
}
