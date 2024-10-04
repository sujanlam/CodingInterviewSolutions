package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression2 {
    public static void main(String[] args) {
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] chars2 = {'a'};
        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars1));
        //System.out.println("=++++++++++++++++++++++++++++++");
        //System.out.println(compress(chars2));
        //System.out.println("=++++++++++++++++++++++++++++++");
        //System.out.println(compress(chars3));
    }

    public static int compress(char[] chars) {
        String s = "";
        char prevChar = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == prevChar) {
                count++;
            }else {
                s += prevChar;
                if(count > 1){
                    s += count;
                }
                count = 1;
                prevChar = chars[i];
            }
        }
        s += prevChar;
        if(count > 1){
            s += count;
        }
        System.out.println(s);
        return s.length();
    }
}
