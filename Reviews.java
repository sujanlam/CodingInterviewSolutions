package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Reviews {
    public static void main(String[] args) {
        String[] reviews = {
                "The quality is really poor. I'm very disappointed.",
                "Very bad",
                "Great",
                "very Great service but terrible still good"
        };

        // Positive, negative, and intensifier words
        String[] positiveWords = {"love", "great", "exceeded", "good", "amazing"};
        String[] negativeWords = {"poor", "disappointed", "bad", "terrible"};
        String[] intensifiers = {"very", "really", "extremely"};
        List<String> sents = analyzeSentiment(reviews, positiveWords, negativeWords, intensifiers);
        System.out.println(sents);
    }
    public static List<String> analyzeSentiment(String[] reviews, String[] positiveWords, String[] negativeWords, String[] intensifiers) {
        List<String> sentiments = new ArrayList<>();
        Set<String> positiveWordSet = Arrays.stream(positiveWords).collect(Collectors.toSet());
        Set<String> negativeWordSet = Arrays.stream(negativeWords).collect(Collectors.toSet());
        Set<String> intensifierSet = Arrays.stream(intensifiers).collect(Collectors.toSet());



        for(String review : reviews) {
            int positiveWordCount = 0;
            int negativeWordCount = 0;
            String[] reviewWords = review.toLowerCase().split("\\s");
            for (int i = 0; i < reviewWords.length; i++) {

                String word = reviewWords[i].replaceAll("\\p{Punct}", "");
                //System.out.println(word);
                if(positiveWordSet.contains(word)) {
                    positiveWordCount++;
                }else if(negativeWordSet.contains(word)) {
                    negativeWordCount++;
                }else if(intensifierSet.contains(word) && i+1 < reviewWords.length) {
                    String nextWord = reviewWords[i+1].replaceAll("\\p{Punct}", "");
                    if(positiveWordSet.contains(nextWord)) {
                        positiveWordCount++;
                    }else if(negativeWordSet.contains(nextWord)) {
                        negativeWordCount++;
                    }
                    i++;
                }
//"very Great service but terrible still good"
            }
            if(positiveWordCount > negativeWordCount) {
                sentiments.add("positive");
            }else if(positiveWordCount < negativeWordCount) {
                sentiments.add("negative");
            }else {
                sentiments.add("neutral");
            }

        }

        return sentiments;
    }

}
