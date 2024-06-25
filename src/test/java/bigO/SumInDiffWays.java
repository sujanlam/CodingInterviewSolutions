package bigO;

public class SumInDiffWays {
    public static void main(String[] args) {
        double start = System.nanoTime();
        calSumUsingLoop(1000);
        double end = System.nanoTime();
        double timeTaken = end-start;
        System.out.println(timeTaken);
        double start1 = System.nanoTime();
        calSumUsingFormula(1000);
        double end1 = System.nanoTime();
        double timeTaken1 = end1-start1;
        System.out.println(timeTaken1);
        double timeOver = (timeTaken/timeTaken1)*100;
        System.out.println("Percent Over:"+ timeOver);
    }

    static int calSumUsingLoop(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += n;
        }
        return sum;
    }

    static int calSumUsingFormula(int n){
        int sum = (n*(n+1))/2;

        return sum;
    }
}
