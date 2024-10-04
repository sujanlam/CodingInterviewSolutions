package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;
    private int age;
    private int deptWorking;  // Changed to String

    public Employee(String name, int age, int deptWorking) {
        this.name = name;
        this.age = age;
        this.deptWorking = deptWorking;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDeptWorking() {
        return deptWorking;
    }

}

public class FirstNonRepNumber {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
        new Employee("Frank", 30, 5),
        new Employee("John", 23, 1),
        new Employee("Didier", 36, 2),
        new Employee("Mikel", 12, 4),
        new Employee("Jose", 56, 3),
        new Employee("Paulo", 21, 5)
        ));
        
        List<Integer> nums = Stream.of(1,3,2,4,6,7,8,3,2,4, 6).toList();
        System.out.println(findFirstNonRepeatedNumber(nums));
    }

    private static int findFirstNonRepeatedNumber(List<Integer> nums) {
        Map<Integer, Long> mapp = nums.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        return nums.stream().filter((num -> mapp.get(num) == 1)).findFirst().orElse(0);
    }
}
