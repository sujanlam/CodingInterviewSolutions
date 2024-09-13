package org.example;

public class TestAgain{
    public static void main(String[] args) {
        String word1 = "The quality is really poor. I'm very disappointed.";
        String word = word1.replaceAll("\\p{Punct}", "");
        System.out.println(word);
    }
}

