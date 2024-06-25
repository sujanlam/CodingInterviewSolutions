package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPalindromicSequence {
    public static void main(String[] args) {
        String str = "apple";
        List<String> allPls = allPandromes(str);
        allPls.forEach(System.out::println);
        System.out.println(isPalindrome(str));
    }

    private static List<String> allPandromes(String str) {
        List<String> palindromes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                sb.append(str.charAt(j));
                if(isPalindrome(sb.toString())){
                    palindromes.add(sb.toString());
                }
            }
            sb.setLength(0);
        }

        return palindromes;
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
