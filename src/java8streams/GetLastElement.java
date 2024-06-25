package java8streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetLastElement {
    public static void main(String[] args) {
        List<String> listofElements = Arrays.asList("One", "Two", "Three","Four", "Ones");
        getResult(listofElements);
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        // Print the Map using Streams
        map.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }

    private static void getResult(List<String> listofElements) {
        System.out.println(listofElements);
        String lastElement = listofElements.stream().skip(listofElements.size()-1).findFirst().get().toUpperCase();
        System.out.println(lastElement);
    }
}
