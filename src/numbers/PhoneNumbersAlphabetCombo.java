package numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumbersAlphabetCombo {
    public static void main(String[] args) {
        List<String> res = letterCombinations("78");
        System.out.println(res.size());
        System.out.println(res);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }
        Map<Character, String> mapp = new HashMap<>();
        mapp.put('2', "abc");
        mapp.put('3', "def");
        mapp.put('4', "ghi");
        mapp.put('5', "jkl");
        mapp.put('6', "mno");
        mapp.put('7', "pqrs");
        mapp.put('8', "tuv");
        mapp.put('9', "wxyz");

        letterUtil(digits, mapp, new StringBuilder(), 0, result);

        return result;
    }

    public static void letterUtil(String digits, Map<Character, String> mapDigits, StringBuilder sb, int index, List<String> res) {

        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String eachChars = mapDigits.get(digits.charAt(index));

        for (int i = 0; i < eachChars.length(); i++) {
            sb.append(eachChars.charAt(i));
            letterUtil(digits, mapDigits, sb, index + 1, res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
