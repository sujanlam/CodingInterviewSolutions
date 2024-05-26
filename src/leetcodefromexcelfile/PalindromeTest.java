package leetcodefromexcelfile;

public class PalindromeTest {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countPalindromes(s));
        //String ss = "abc";
        //System.out.println(countPalindromes(ss));
    }
    public static int countPalindromes(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += countPalindromesAroundCenter(s, i, i);
            count += countPalindromesAroundCenter(s, i, i + 1);
        }
        return count;
    }

    private static int countPalindromesAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

}
