package strings;

import java.util.Stack;

public class isPalindromeofString {
    public static void main(String[] args) {
        String str = "pmnlnmp";
        System.out.println("Is \""+ str+ "\" palindrome? "+isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(leftChar != rightChar){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
