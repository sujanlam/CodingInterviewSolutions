package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FetchCharsBetnParenthesis {
    public static void main(String[] args) {
        System.out.println(getCharsInPat("[a] [b] c (d e f) x (y) z"));
        System.out.println(getCharsInPat("abc(def)x(y)z"));
    }
    public static List<String> getCharsInPat(String str){
        // Define the regex pattern to find content inside parentheses
        String regex = "\\(([^)]*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        ArrayList<String> results = new ArrayList<>();

        // Find all matches and add them to the results list
        while (matcher.find()) {
            results.add(matcher.group(1)); // Group 1 is the content inside the parentheses
        }

        return results;
    }
}
