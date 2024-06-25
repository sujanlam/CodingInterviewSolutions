package recursions;

public class CalcPowerUsingRecurs {
    public static void main(String[] args) {
        int res = factorialUsingRecurs(2, 8);
        System.out.println(res);
    }

    private static int factorialUsingRecurs(int base, int exponent) {
        if (exponent < 1) {
            return 1;
        }
        return base * factorialUsingRecurs(base, exponent - 1);
    }

}
