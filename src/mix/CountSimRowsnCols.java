package mix;

import java.util.HashMap;
import java.util.Map;

public class CountSimRowsnCols {
    public static void main(String[] args) {
        //int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        //int[][] grid = {{11,1}, {1,11}};
        System.out.println(equalPairs(grid));
    }
    public static int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        Map<String, Integer> colMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]);
                sb.append("*");
            }
            String str= sb.toString();
            rowMap.put(str,rowMap.getOrDefault(str, 0)+1);

        }
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[j][i]);
                sb.append("*");
            }

            String str = sb.toString();
            colMap.put(str, colMap.getOrDefault(str, 0)+1);

        }
        System.out.println(rowMap);
        System.out.println(colMap);
        for (String s: rowMap.keySet()){
            if(colMap.containsKey(s)){
                count += colMap.get(s)* rowMap.get(s);
            }
        }
        return count;
    }
}
