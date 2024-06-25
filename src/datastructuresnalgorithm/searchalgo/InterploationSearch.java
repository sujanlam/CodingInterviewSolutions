package searchalgo;

import java.util.Arrays;

public class InterploationSearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int target = 256;
        double startintsearch = System.nanoTime();
        int indexInt = interpolationSearch(array, target);
        double endintsearch = System.nanoTime();
        System.out.println("Int Search time: " + (endintsearch - startintsearch));
        System.out.println("Index of target from Interpolation Search:" + indexInt);
        System.out.println(Arrays.binarySearch(array, target));
        double starbinsearch = System.nanoTime();
        int aa = Arrays.binarySearch(array, target);
        double endstarbinsearch = System.nanoTime();
        System.out.println("Index of target from binary Search:" + aa);
        System.out.println("Int Search time: " + (endintsearch - startintsearch));
        double starbinsearchCustom = System.nanoTime();
        int bb = binarySearch.findNum(array, target);
        double endstarbinsearchCustom = System.nanoTime();
        System.out.println("Index of target from binary Search:" + bb);
        System.out.println("Int Search time: " + (endstarbinsearchCustom - starbinsearchCustom));
    }

    private static int interpolationSearch(int[] array, int target) {
        int high = array.length - 1;
        int low = 0;
        while (target >= array[low] && target <= array[high] && low <= high) {
            int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);
            System.out.println("Probe is: " + probe);
            if (array[probe] == target) {
                return probe;
            } else if (array[probe] < target) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
