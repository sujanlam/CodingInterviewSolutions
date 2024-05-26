package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SentimentAnalyzer {
    public static String analyzeSentiment(String review, String[] positiveWords, String[] negativeWords, String[] intensifiers) {
        Set<String> positiveSet = new HashSet<>(Arrays.asList(positiveWords));
        Set<String> negativeSet = new HashSet<>(Arrays.asList(negativeWords));
        Set<String> intensifierSet = new HashSet<>(Arrays.asList(intensifiers));

        // Tokenize the review into words
        String[] words = review.toLowerCase().split("\\s+");

        int positiveScore = 0;
        int negativeScore = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i].replaceAll("\\p{Punct}", "");
            System.out.println("Word is: "+word);
            if (positiveSet.contains(word)) {
                positiveScore++;
            } else if (negativeSet.contains(word)) {
                negativeScore++;
            } else if (intensifierSet.contains(word) && i + 1 < words.length) {
                String nextWord = words[i + 1];
                System.out.println(nextWord);
                if (positiveSet.contains(nextWord)) {
                    positiveScore++;
                } else if (negativeSet.contains(nextWord)) {
                    negativeScore++;
                }
            }
        }

        // Determine overall sentiment
        if (positiveScore > negativeScore) {
            return "positive";
        } else if (positiveScore < negativeScore) {
            return "negative";
        } else {
            return "neutral";
        }
    }

    public static void main(String[] args) {
        // Example reviews
        /*String[] reviews = {
                "I love this product! It works great.",
                "The quality is really poor. I'm very disappointed.",
                "It's okay, but I expected better.",
                "This product exceeded my expectations!"
        };*/
        String[] reviews = {

                "The quality is really poor. I'm very disappointed."
        };

        // Positive, negative, and intensifier words
        String[] positiveWords = {"love", "great", "exceeded", "good", "amazing"};
        String[] negativeWords = {"poor", "disappointed", "bad", "terrible"};
        String[] intensifiers = {"very", "really", "extremely"};

        // Analyze the sentiment of each review
        for (String review : reviews) {
            String sentiment = analyzeSentiment(review, positiveWords, negativeWords, intensifiers);
            System.out.println("Review: " + review);
            System.out.println("Sentiment: " + sentiment);
            System.out.println();
        }
    }
}
