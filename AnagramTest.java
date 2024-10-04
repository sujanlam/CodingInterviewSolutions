package strings;

import java.util.*;

public class AnagramTest {
    public static void main(String[] args) {
        String a ="cata";
        String b ="acat";
        System.out.println(isAnagram(a, b));
        System.out.println(isAnagramWMap(a, b));
    }

    public static boolean isAnagramWMap(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map);
        for(int i = 0; i < t.length(); i++) {
            if(!map.containsKey(t.charAt(i))) return false;
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            System.out.println(map);
            if(map.get(t.charAt(i)) < 0) return false;
        }


        return true;

    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(ts);

        return Arrays.equals(ss, ts);

    }
}
