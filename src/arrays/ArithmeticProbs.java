package arrays;

public class ArithmeticProbs {
    public static void main(String[] args) {
        System.out.println(operate(1,1,"+"));
        System.out.println(discount(1500,50));
    }

    public static int countTrue(boolean[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== true){
                count++;
            }
        }
        return count;
    }
    public static double discount(int price, int percentage) {
        double discount= (percentage/100.00)*price;

        return discount;
    }
    public static int operate(int num1, int num2, String operator) {
        int result = 0;
        switch(operator){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
        }
        return result;
    }
}
