package com.zking.asset.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


public class RedisCacheTransfer {
    /*@autowirde根据类型匹配*/
    @Autowired
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        RedisCache.setRedisTemplate(redisTemplate);
    }
}
