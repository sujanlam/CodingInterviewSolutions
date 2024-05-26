package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RoadNameCheck {
    static boolean checkRoads(int[][] roads) {
        Map<Integer, Set<Integer>> names = new HashMap<>();
        for (int[] road : roads) {
            int a = road[0];
            int b = road[1];
            int r = road[2];

            if (names.containsKey(r - 1) && (names.get(r - 1).contains(b) || names.get(r - 1).contains(a))) {
                return false;
            }
            if (names.containsKey(r + 1) && (names.get(r + 1).contains(b) || names.get(r + 1).contains(a))) {
                return false;
            }

            names.computeIfAbsent(r, k -> new HashSet<>()).add(a);
            names.computeIfAbsent(r, k -> new HashSet<>()).add(b);
            for(Map.Entry<Integer, Set<Integer>> entry: names.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[][] roads1 = {
                {0, 1, 0},
                {4, 1, 2},
                {4, 3, 4},
                {2, 3, 1},
                {2, 0, 3}
        };
        int[][] roads2 = {
                {2, 3, 1},
                {3, 0, 0},
                {2, 0, 2}
        };
        boolean result = checkRoads(roads1);
        System.out.println("Does the roads arrangement satisfy the constraint? " + result);
    }

}

