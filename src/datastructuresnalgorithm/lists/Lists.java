package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(7);
        list.add(18);
        list.add(2);
        System.out.println(list);
        for (int n: list){
            System.out.println(n);
        }
        List<Integer> l1 = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(l1);
        System.out.println();
    }
}
