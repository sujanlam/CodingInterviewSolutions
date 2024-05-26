package com.codes.arrays;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "m", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Map<Character, Integer> mapOfStones = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            mapOfStones.put(stones.charAt(i), mapOfStones.getOrDefault(stones.charAt(i),0)+1);
        }
        System.out.println(mapOfStones);
        for (int i = 0; i < jewels.length(); i++) {
            if (mapOfStones.containsKey(jewels.charAt(i))) {
                count += mapOfStones.get(jewels.charAt(i));
            }
        }
        return count;
    }
}
