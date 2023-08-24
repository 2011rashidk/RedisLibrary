package org.example;

import redis.clients.jedis.Jedis;

public class RedisUtil {

    public static final String LOCALHOST = "localhost";

    public void set(String key, String value) {
        try {
            Jedis jedis = new Jedis(LOCALHOST);
            jedis.set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String get(String key) {
        try {
            Jedis jedis = new Jedis(LOCALHOST);
            return jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
