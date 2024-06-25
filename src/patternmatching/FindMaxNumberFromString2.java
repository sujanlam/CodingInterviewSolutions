package patternmatching;

import java.util.ArrayList;

public class FindMaxNumberFromString2 {
    public static void main(String[] args) {
        String str = "gt233sdr123mps55vb5";
        System.out.println("The largest number is: " + largestNumInString(str));
    }
    public static int largestNumInString(String S){
        int maxNum = Integer.MIN_VALUE;
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if(Character.isDigit(S.charAt(i))){
                sb.append(S.charAt(i));
                maxNum = Math.max(maxNum, Integer.parseInt(sb.toString()));
            }else{
                sb.setLength(0);
                continue;
            }
        }

        return maxNum;
    }
}
