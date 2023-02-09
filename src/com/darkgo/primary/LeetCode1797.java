package com.darkgo.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/2/9
 */
public class LeetCode1797 {
    class AuthenticationManager {
        private int timeToLive;
        private Map<String,Integer> map;
        public AuthenticationManager(int timeToLive) {
            this.timeToLive = timeToLive;
            map = new HashMap<>();
        }

        public void generate(String tokenId, int currentTime) {
            map.put(tokenId, currentTime);
        }

        public void renew(String tokenId, int currentTime) {
            if (map.containsKey(tokenId)) {
                Integer integer = map.get(tokenId);
                if (integer + timeToLive > currentTime) {
                    map.put(tokenId, currentTime);
                }
            }
        }

        public int countUnexpiredTokens(int currentTime) {
            int ans = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() + timeToLive > currentTime) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
