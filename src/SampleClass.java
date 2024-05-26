package java8streams;

import java.util.Arrays;
import java.util.List;

public class SampleClass {
        public static void main(String[] args) {
            List<String> listofElements = Arrays.asList("One", "Two", "Three","Four");
            getResult(listofElements);
        }

        private static void getResult(List<String> listofElements) {
            System.out.println(listofElements);
        }

}
