package strings;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StringsCompression {
    public static void main(String[] args) {
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] chars2 = {'a'};
        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars1));
        System.out.println("=++++++++++++++++++++++++++++++");
        System.out.println(compress(chars2));
        System.out.println("=++++++++++++++++++++++++++++++");
        System.out.println(compress(chars3));
    }

    public static int compress(char[] chars) {
        String s = "";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //System.out.println(map);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            s += entry.getKey();
            int value = entry.getValue();
            if (value > 1) {
                s += value;
            }

        }
        System.out.println(s);
        return s.length();
    }
}
