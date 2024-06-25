package arrays;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverse(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
        System.out.println(getOpposite(12345));
    }
    public static int reverse(int number) {

        String numString = Integer.toString(number);

        String reversedString = new StringBuilder().append(numString).reverse().toString();

        int reversedNumber = Integer.parseInt(reversedString);

       return reversedNumber;

    }
    public static int getOpposite(int number) {
        return -number;
    }

}
