package com.codes.edabitpractice;

public class ExistsAHigherNumber {
    public static boolean existsHigher(int[] arr, int n) {
        for (int num: arr){
            if(num >= n){
                return true;
            }
        }

        return false;
    }

    public static int equal(int a, int b, int c) {
        if(a==b && b==c & a == c)
        {
            return 3;
        }else if(a==b || b==c) {
            return 2;
        }else {
            return 0;
        }

    }

}
