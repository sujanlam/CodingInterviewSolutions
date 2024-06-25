package strings;

public class CountNumOfPalindromes {
    public static void main(String[] args) {
        String word = "aaa";
        System.out.println(countAllPalindromes(word));
    }

    private static int countAllPalindromes(String s) {
        if(s.isEmpty()){
            return 0;
        }
        StringBuilder snb = new StringBuilder();
        int count = 0;
        int left = 0;
        int right = s.length();
        for (int i = 0; i < right; i++) {
            for (int j = i; j < right; j++) {
                snb.append(s.charAt(j));
                if(isThisPalindrome(snb.toString())){
                    count++;
                }
            }
            snb.setLength(0);
        }
        return count;

    }

    private static boolean isThisPalindrome(String string) {
        int left = 0;
        int right = string.length()-1;
        while (left < right){
            if(string.charAt(left) != string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
