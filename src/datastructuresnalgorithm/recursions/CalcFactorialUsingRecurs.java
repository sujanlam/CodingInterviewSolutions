package recursions;

public class CalcFactorialUsingRecurs {
    public static void main(String[] args) {
        int res = factorialUsingRecurs(7);
        System.out.println(res);
    }

    private static int factorialUsingRecurs(int n) {
        if(n <= 2 ){
            return n;
        }
        return n*factorialUsingRecurs(n-1);
    }

}
