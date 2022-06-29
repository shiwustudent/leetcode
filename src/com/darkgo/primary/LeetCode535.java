package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * TinyURL 的加密与解密
 * </p>
 *
 * @author ShiWu
 * @since 2022/6/29
 */
public class LeetCode535 {
    private class Codec {
        Map<Integer,String> map = new HashMap<>();
        int id=0;
        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            id++;
            map.put(id,longUrl);
            return "http://tinyurl.com/"+id;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            int p = shortUrl.lastIndexOf("/")+1;
            int key = Integer.parseInt(shortUrl.substring(p));
            return map.get(key);
        }
    }
}
