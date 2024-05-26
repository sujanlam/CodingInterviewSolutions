package mix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestTimeWatchingMovies {
    public static void main(String[] args) {
        List<Integer> comedyReleaseTime = Arrays.asList(1,4,1);
        List<Integer> comedyDuration=     Arrays.asList(3,2,2);
        List<Integer> dramaReleaseTime =  Arrays.asList(5,2,3);
        List<Integer> dramaDuration=      Arrays.asList(2,1,2);
        System.out.println(minTimeSpent(comedyReleaseTime, comedyDuration, dramaReleaseTime, dramaDuration));
    }
    public static int minTimeSpent(List<Integer> comedyReleaseTime, List<Integer> comedyDuration, List<Integer> dramaReleaseTime, List<Integer> dramaDuration){
        int minTimeSpent = Integer.MAX_VALUE;
        int n = comedyDuration.size();

        for (int i = 0; i < n; i++) {
            int comedyGoesTill = comedyReleaseTime.get(i)+comedyDuration.get(i);
            for (int j = 0; j < n; j++) {
                int totalTime;
                if((dramaReleaseTime.get(j) <= comedyGoesTill)){
                    totalTime = comedyGoesTill + dramaDuration.get(j);
                }else{
                    totalTime = dramaReleaseTime.get(j)+dramaDuration.get(j);
                }
                minTimeSpent = Math.min(minTimeSpent, totalTime);
            }
        }
        return minTimeSpent;
    }
}
