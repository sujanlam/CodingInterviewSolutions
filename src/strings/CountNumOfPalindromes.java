package strings;

public class CountNumOfPalindromes {
    public static void main(String[] args) {
        String word = "abc";
        System.out.println(countAllPalindromes(word));
        System.out.println(isThisPalindrome("a"));
        System.out.println(isThisPalindrome("b"));
        System.out.println(isThisPalindrome("c"));
        System.out.println(isThisPalindrome("ab"));
        System.out.println(isThisPalindrome("bc"));
        System.out.println(isThisPalindrome("abc"));
    }

    private static int countAllPalindromes(String s) {

        int totalPalindromes = 0;
        int left = 0;
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                sb.append(s.charAt(j));
                if(isThisPalindrome(sb.toString())){
                    totalPalindromes++;
                }
            }
            sb.setLength(0);

        }
        return totalPalindromes;
    }

    private static boolean isThisPalindrome(String string) {
        StringBuilder sb = new StringBuilder(string);
        if(sb.reverse().toString().equalsIgnoreCase(string)){
            return true;
        }
        return false;
    }

}
