package com.wanda.redis;

import redis.clients.jedis.Jedis;

/**
 * @author yangyang
 *
 */
public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.203.128");
        jedis.set("foo", "bar3");
        String value = jedis.get("foo");
        jedis.close();
        System.out.println(value);
    }
}
