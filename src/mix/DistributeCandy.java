package mix;

public class DistributeCandy {
    public static void main(String[] args) {
        int n = 3, limit = 3;
        System.out.println(distCandies(n, limit));
    }

    private static long distCandies(int n, int limit) {
        int distCount = 0;

        for (int i = 0; i <= limit; i++) {
            int firstLeftOver = n - i;
            int secondLeftOver = Math.abs(firstLeftOver - limit);

            if (limit >= secondLeftOver) {
                distCount += 1 + Math.abs(limit - secondLeftOver);
            }else {
                continue;
            }

        }

        return distCount;
    }
}
