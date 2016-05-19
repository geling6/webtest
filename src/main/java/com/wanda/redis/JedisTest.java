package com.wanda.redis;

import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author yangyang
 * @desc 纯jedis做客户端操作redis集群
 */
public class JedisTest {
    public static void main(String[] args) {
        /*Jedis jedis = new Jedis("192.168.203.128");
        jedis.set("foo", "bar3");
        String value = jedis.get("foo");
        jedis.close();
        System.out.println(value);*/
        
        Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
        jedisClusterNodes.add(new HostAndPort("192.168.203.131",6379));
        jedisClusterNodes.add(new HostAndPort("192.168.203.130",6379));
        jedisClusterNodes.add(new HostAndPort("192.168.203.128",6379));
        jedisClusterNodes.add(new HostAndPort("192.168.203.132",6379));
        jedisClusterNodes.add(new HostAndPort("192.168.203.134",6379));
        jedisClusterNodes.add(new HostAndPort("192.168.203.135",6379));
        
        JedisPoolConfig cfg = new JedisPoolConfig();
        cfg.setMaxIdle(10);
        cfg.setMaxTotal(15);
        cfg.setMaxWaitMillis(-1);
        cfg.setTestOnBorrow(true);
        
        JedisCluster cluster = new JedisCluster(jedisClusterNodes,1000,6000,cfg);
        
        System.out.println(cluster.set("fuck", "hui"));
        System.out.println(cluster.set("ssh", "struts+spring+hibernate"));
        
        System.out.println(cluster.get("fuck"));
        System.out.println(cluster.get("ssh"));
        
        cluster.close();
    }
}
