package leetcodefromexcelfile;

public class PalindromeSubstrings {
    public static void main(String[] args) {
        String s1 = "aaa";
        //String s2 = "aaa";

        System.out.println(countSubstrings(s1));
        //System.out.println(countSubstrings(s2));
    }

    private static int countSubstrings(String s) {
        int count = 0;
        int i = 0;
        int j = s.length();
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < j; k++) {
            for (int l = k; l < j; l++) {
                String testPal = sb.append(s.charAt(l)).toString();
                if(isPalindrome(testPal)){
                    count++;
                }
            }
            sb.setLength(0);
        }

        return count;
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        if (s.equalsIgnoreCase(sb.toString())) {
            return true;
        }
        return false;
    }
}
