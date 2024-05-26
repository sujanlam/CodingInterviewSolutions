package mix;

import java.util.HashMap;
import java.util.Map;

public class CountGoodMeals {
    public static void main(String[] args) {
        int[] deliciousness = {1,3,5,7,9};
        //int[] deliciousness = {1, 1, 1, 3, 3, 3, 7};
        System.out.println(countPairs(deliciousness));
    }

    public static int countPairs(int[] deliciousness) {
        Map<Integer, Integer> mapp = new HashMap<>();
        int n = deliciousness.length;
        int modl = 1000000007;
        int countPairs = 0;
        for (Integer num : deliciousness) {
            for (int j = 0; j <= 22; j++) {
                int k = (int) Math.pow(2, j);
                if (mapp.containsKey(k - num)) {
                    countPairs += mapp.get(k - num);
                    countPairs %= modl;
                }
            }
            mapp.put(num, mapp.getOrDefault(num, 0) + 1);
        }
        return countPairs;
    }
}
