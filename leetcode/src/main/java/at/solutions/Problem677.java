package at.solutions;

import java.util.*;

public class Problem677 {

    public static class MapSum {

        private final Map<String, Integer>[] alphaMaps;

        public MapSum() {
            alphaMaps = new HashMap[26];

            for(int i = 0 ; i < alphaMaps.length; i++) {
                alphaMaps[i] = new HashMap<>();
            }
        }

        public void insert(String key, int val) {
            char c = key.charAt(0);
            alphaMaps[c - 'a'].put(key, val);
        }

        public int sum(String prefix) {
            char c = prefix.charAt(0);
            int sum = 0;
            for(Map.Entry<String, Integer> entry : alphaMaps[c - 'a'].entrySet()) {
                if(entry.getKey().startsWith(prefix)) {
                    sum += entry.getValue();
                }
            }
            return sum;
        }
    }

}
