package edabitpractice;

public class CheckStringEnds {
    //checkEnding("abc", "bc") ➞ true
    public static void main(String[] args) {
        System.out.println(checkEnding("abc", "bd"));
        System.out.println(formatPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    public static boolean checkEnding(String str1, String str2) {
        if(str2.equals(str1.substring(str1.length()-str2.length()))){
            return true;
        }
        return false;
    }
    public static String getWord(String left, String right) {
        //getWord("seas", "onal") ➞ "Seasonal"
        return left.substring(0,1).toUpperCase()+left.substring(1)+right;
    }

    public static boolean changeEnough(int[] change, double amountDue) {
        double amountInQuartrs = (change[0]*25)/100.00;
        double amountInDime = (change[1]*10)/100.00;
        double amountInNickels = (change[2]*5)/100.00;
        double amountInPennies = change[3]/100.00;

        if((amountInQuartrs+amountInDime+amountInNickels+amountInPennies) >= amountDue){
            return true;
        }

        return false;

    }
    public static int differenceMaxMin(int[] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return max - min;
    }
    //formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) ➞ "(123) 456-7890"
    public static String formatPhoneNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        sb.append("\"(");
        for (int i = 0; i < 3; i++) {
            sb.append(nums[i]);
        }
        sb.append(") ");
        for (int i = 3; i < 6; i++) {
            sb.append(nums[i]);
        }
        sb.append("-");
        for (int i = 6; i < 10; i++) {
            sb.append(nums[i]);
        }
        sb.append("\"");


        return sb.toString();

    }
}
