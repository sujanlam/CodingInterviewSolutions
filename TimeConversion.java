package conversion;

import java.util.HashMap;
import java.util.Map;

public class TimeConversion {

    private static String convertToWords(int h, int m) {
        String timeDesc = "";
        Map<Integer, String> timeMap = new HashMap<>();
        timeMap.put(1, "one");
        timeMap.put(2, "two");
        timeMap.put(3, "three");
        timeMap.put(4, "four");
        timeMap.put(5, "five");
        timeMap.put(6, "six");
        timeMap.put(7, "seven");
        timeMap.put(8, "eight");
        timeMap.put(9, "nine");
        timeMap.put(10, "ten");
        timeMap.put(11, "eleven");
        timeMap.put(12, "twelve");
        timeMap.put(13, "thirteen");
        timeMap.put(14, "fourteen");
        timeMap.put(15, "quarter");   // Special case for quarter past/to
        timeMap.put(16, "sixteen");
        timeMap.put(17, "seventeen");
        timeMap.put(18, "eighteen");
        timeMap.put(19, "nineteen");
        timeMap.put(20, "twenty");
        timeMap.put(21, "twenty one");
        timeMap.put(22, "twenty two");
        timeMap.put(23, "twenty three");
        timeMap.put(24, "twenty four");
        timeMap.put(25, "twenty five");
        timeMap.put(26, "twenty six");
        timeMap.put(27, "twenty seven");
        timeMap.put(28, "twenty eight");
        timeMap.put(29, "twenty nine");
        timeMap.put(30, "half");   // Special case for half past

        if(m == 0){
            return timeMap.get(h)+" "+ "o' clock";
        }
        if(m <= 30){
            if(m == 15){
                timeDesc = "quarter past "+timeMap.get(h);
            }else if(m == 30){
                timeDesc = "half past "+timeMap.get(h);
            }else if(m > 0 && m < 30){
                timeDesc = (m ==1 ?timeMap.get(m) + " minute past "+timeMap.get(h):timeMap.get(m)+" minutes past "+timeMap.get(h+1));
            }
        }else {
            int minutesTo = 60- m;
            int nextHour = (h % 12)+1;
            if(minutesTo == 15){
                timeDesc = "quarter to "+timeMap.get(nextHour);
            }else{
                timeDesc = (m==1?timeMap.get(minutesTo)+" minute to "+timeMap.get(nextHour): timeMap.get(minutesTo)+" minutes to "+timeMap.get(nextHour));
            }
        }

        return timeDesc;
    }

    public static void main(String[] args) {
        System.out.println(convertToWords(5, 00));
        System.out.println(convertToWords(5, 01));
        System.out.println(convertToWords(5, 10));
        System.out.println(convertToWords(5, 15));
        System.out.println(convertToWords(5, 28));
        System.out.println(convertToWords(5, 30));
        System.out.println(convertToWords(5, 40));
        System.out.println(convertToWords(5, 45));
        System.out.println(convertToWords(5, 47));

        System.out.println(convertToWords(4, 15));

    }
}
