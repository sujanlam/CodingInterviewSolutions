package mix;

import java.util.*;

public class MovieWatch {
    public static int minTimeSpent(List<Integer> comedyReleaseTime, List<Integer> comedyDuration, List<Integer> dramaReleaseTime, List<Integer> dramaDuration) {
        List<Movie> movies = new ArrayList<>();

        // Add comedy movies
        for (int i = 0; i < comedyReleaseTime.size(); i++) {
            movies.add(new Movie(comedyReleaseTime.get(i), comedyDuration.get(i), 'C'));
        }

        // Add drama movies
        for (int i = 0; i < dramaReleaseTime.size(); i++) {
            movies.add(new Movie(dramaReleaseTime.get(i), dramaDuration.get(i), 'D'));
        }

        // Sort movies by release time
        Collections.sort(movies, (a, b) -> a.releaseTime - b.releaseTime);

        int minTimeSpent = Integer.MAX_VALUE;
        int totalComedy = 0;
        int totalDrama = 0;

        for (Movie movie : movies) {
            if (movie.genre == 'C') {
                totalComedy += movie.duration;
            } else {
                totalDrama += movie.duration;
            }

            if (totalComedy > 0 && totalDrama > 0) {
                minTimeSpent = Math.min(minTimeSpent, Math.max(totalComedy, totalDrama));
            }
        }

        return minTimeSpent;
    }

    public static void main(String[] args) {
        List<Integer> comedyReleaseTime = Arrays.asList(1, 5, 7);
        List<Integer> comedyDuration = Arrays.asList(2, 3, 4);
        List<Integer> dramaReleaseTime = Arrays.asList(2, 4, 6);
        List<Integer> dramaDuration = Arrays.asList(1, 2, 3);

        System.out.println(minTimeSpent(comedyReleaseTime, comedyDuration, dramaReleaseTime, dramaDuration)); // Output: 6
    }
}

class Movie {
    int releaseTime;
    int duration;
    char genre;

    public Movie(int releaseTime, int duration, char genre) {
        this.releaseTime = releaseTime;
        this.duration = duration;
        this.genre = genre;
    }
}
