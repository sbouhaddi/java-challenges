package dev.sabri;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapChallenge {

    public static void main(String... args) {
        var cache = new ConcurrentHashMap<String, Object>();
        cache.put("111", new Double(5));
        cache.putIfAbsent("111", "LOL");
        cache.put("111", new Integer(4));
        cache.put("222", new Integer(4));

        System.out.println(cache);

    }
}
