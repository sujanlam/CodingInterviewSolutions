package patternmatching;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMaxNumberFromString {
    public static void main(String[] args) {
        int largestNumber = 0;
        String input = "gt23sdr123mps55vb5";
        String[] arr = input.split("\\D+");
        ArrayList<String> arrList = new ArrayList<>();
        for (String s: arr){
            if(!s.isEmpty()){
                arrList.add(s);
            }
        }
        System.out.println(arrList);

        for (int i = 0; i < arrList.size(); i++) {
            if(Integer.parseInt(arrList.get(i)) > largestNumber){
                largestNumber = Integer.parseInt(arrList.get(i));
            }
        }

        // Print the largest number
        System.out.println("The largest number is: " + largestNumber);
    }

    public static int findLargestNumber(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
