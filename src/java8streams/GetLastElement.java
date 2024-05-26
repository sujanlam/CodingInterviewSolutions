package java8streams;

import java.util.Arrays;
import java.util.List;

public class GetLastElement {
    public static void main(String[] args) {
        List<String> listofElements = Arrays.asList("One", "Two", "Three","Four", "Ones");
        getResult(listofElements);
    }

    private static void getResult(List<String> listofElements) {
        System.out.println(listofElements);
        String lastElement = listofElements.stream().skip(listofElements.size()-1).findFirst().get().toUpperCase();
        System.out.println(lastElement);
    }
}
