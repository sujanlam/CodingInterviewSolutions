package strings;

import java.util.ArrayList;
import java.util.List;

public class SubstringConcatenation {
    public static void main(String[] args) {
       String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};
        System.out.println(findSubstring(s, words));
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(words[i]);
            for (int j = i + 1; j < words.length; j++) {
                sb.append(words[j]);
            }
            System.out.println(sb.toString());
        }


        return result;

    }
}
