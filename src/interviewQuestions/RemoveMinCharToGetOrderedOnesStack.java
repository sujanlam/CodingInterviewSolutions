package interviewQuestions;

import java.util.Stack;

public class RemoveMinCharToGetOrderedOnesStack {
    public static void main(String[] args) {
        //String s1 = "BAAABAB";
        //String s2 = "BBABAA";
        String s3 = "AABBBB";
        //String s4 = "AABABBAB";

        //System.out.println(countMinDeletedChars(s4));
        //System.out.println(countMinDeletedChars(s2));
        System.out.println(countMinDeletedChars(s3));
    }

    /*private static int countMinDeletedChars(String s) {
        int n = s.length();
        int i = 0;
        int countRemoval = 0;
        Stack<Character> stack = new Stack<>();

        while (i < n){
            while ((i < n)  && !stack.isEmpty() && (s.charAt(i)=='A') && (s.charAt(i-1)=='B')){
                stack.pop();
                i++;
                countRemoval++;
            }
            if( i < n){
                stack.push(s.charAt(i));
            }
            i++;
        }
        return countRemoval;
    }*/
    private static int countMinDeletedChars(String s) {
        int n = s.length();
        int left_B = 0, right_A = 0, ans;

        // Count initial 'A's
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                right_A++;
            }
        }

        ans = right_A;

        // Calculate minimum deletions
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                right_A--;
            } else {
                left_B++;
            }
            ans = Math.min(ans, right_A + left_B);
        }

        return ans;
    }

}



