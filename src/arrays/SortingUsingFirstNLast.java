package arrays;

import java.util.Arrays;

public class SortingUsingFirstNLast {
    public static void main(String[] args) {
        int[] a = {1,3,5,6,4,2,7};
        System.out.println(sortLastFirst(a));
        int[] aa = {1,3,5,6,4,2};
        System.out.println(sortLastFirst(aa));
    }

    private static boolean sortLastFirst(int[] a) {
        int[] b = new int[a.length];
        int last = a.length;
        int middle = (last-1)/2;
        int preindx = 0;
        int postindx = 1;
        for (int i = 0; i <= middle; i++) {
            b[preindx]= a[i];
            preindx += 2;
        }
        for (int i = last-1; i > middle; i--) {
            b[postindx] = a[i];
            postindx += 2;
        }
        printArray(a);
        System.out.println();
        printArray(b);
        System.out.println();

        Arrays.sort(a);
        printArray(a);
        System.out.println();
        boolean isEqual1 = Arrays.equals(a, b);
        if(isEqual1){
            return true;
        }
        return false;
    }

    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
