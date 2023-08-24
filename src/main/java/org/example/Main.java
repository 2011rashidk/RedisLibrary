package org.example;

public class Main {
    public static void main(String[] args) {
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.set("someKey", "someValue");
        String value = redisUtil.get("anyKey");
        System.out.println("value = " + value);
    }
}