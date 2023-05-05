package com.huaheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangcong
 * @version 1.0
 * @date 2023/5/5 - 14:36
 */
@RestController
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/testRedis")
    public String testRedis(){
        //设置值到redis去
        redisTemplate.opsForValue().set("name","wc");
        String name = redisTemplate.opsForValue().get("name").toString();
        return name;
    }
}
