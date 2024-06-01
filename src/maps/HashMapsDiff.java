package maps;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapsDiff {
    public static void main(String[] args) {
        HashMap<String, Integer> mapp = new HashMap<>();
        mapp.put("Sam", 33);
        mapp.put("Ram", 21);
        mapp.put("Kelly", 45);
        mapp.forEach((key, value) -> System.out.println(key+" "+value));

        ConcurrentHashMap cmapp = new ConcurrentHashMap<>();
        cmapp.put("Sam", 33);
        cmapp.put("Ram", 21);
        cmapp.put("Kelly", 45);
        cmapp.forEach((key, value) -> System.out.println(key+" "+value));
    }
}
