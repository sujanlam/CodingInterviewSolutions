package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertAListToMap {
    public static void main(String[] args) {
        //list of names
        List<String> names = List.of("apple", "banana", "cherry", "date", "elderberry");
        //names.add("Guava");
        System.out.println(names);
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        //fruits.add("Guava");
        System.out.println(fruits);
        List<String> list = Stream.of("apple", "banana", "cherry", "date", "elderberry")
                .collect(Collectors.toList());
        list.add("Guava");
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "apple", "banana", "cherry", "date", "elderberry", "mango");
        list1.add("Papaya");
        System.out.println(list1);
        Map<String, Integer> mapp = list1.stream().collect(Collectors.toMap(name -> name, name -> name.length()));
        System.out.println(mapp);
    }
}
