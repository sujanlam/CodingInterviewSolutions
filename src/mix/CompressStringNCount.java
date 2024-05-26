package mix;

import java.util.HashMap;
import java.util.Map;

public class CompressStringNCount {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        char[] chars1 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars1));
    }
    public static int compress(char[] chars) {
        //int count = 0;
        StringBuilder sb = new StringBuilder();

        HashMap<Character, Integer> mapp = new HashMap<>();
        for (char c: chars){
            mapp.put(c, mapp.getOrDefault(c, 0)+1);
        }
        for (Map.Entry<Character, Integer> entry: mapp.entrySet()){
            if(entry.getValue() > 1){
                sb.append(entry.getKey()).append(entry.getValue());
            }else{
                sb.append(entry.getKey());
            }
        }

        System.out.println(sb.toString());
        return sb.toString().length();
    }
}
