package numbers;

public class MakingPyramid {
    public static void main(String[] args) {
        System.out.println(getPyramidHeight(19));
    }

    private static int getPyramidHeight(int totalCubes) {
        int height = 0;
        int i = 1;
        int cubesLeft = totalCubes;
        while (cubesLeft > 0) {
            int cubeForThisLevelHeight = (i * (i + 1)) / 2;
            if (cubesLeft >= cubeForThisLevelHeight) {
                cubesLeft -= cubeForThisLevelHeight;
                height++;
                i++;
            } else {
                break;
            }
        }
        return height;
    }
}
