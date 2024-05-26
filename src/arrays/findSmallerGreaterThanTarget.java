package arrays;

public class findSmallerGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'x','x','y', 'y'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        char result = 0;
        for (int i=0; i< letters.length; i++){
            if(letters[i] > target){
                result = letters[i];
                return result;
            }else {
                result = letters[0];
            }
        }
        return letters[0];
    }
}
