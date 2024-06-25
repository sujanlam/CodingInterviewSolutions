package strings;

public class PalindromeUsingDynamicProgramming {
    public static void main(String[] args) {
        String word = "fdsklf";
        System.out.println(countAllPalindromes(word));
    }

    private static int countAllPalindromes(String s) {
        int count = 0;
        if (s.isEmpty()) {
            return 0;
        }
        int l = s.length();
        boolean[][] dpPal = new boolean[l][l];

        //For the length of 1
        for (int i = 0; i < l; i++) {
            dpPal[i][i] = true;
            count++;
        }

        //For the length of 2
        for (int i = 0; i < l - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dpPal[i][i + 1] = true;
                count++;
            }
        }

        //For the length of 3 and above //aaaaa
        for (int others = 3; others <= l; others++) {
            for (int i = 0; i < l - others + 1; i++) {
                int j = others + i - 1;
                if (s.charAt(i) == s.charAt(j) && dpPal[i + 1][j - 1]) {
                    dpPal[i][j] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
