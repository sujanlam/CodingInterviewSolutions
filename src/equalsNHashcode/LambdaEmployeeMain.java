package equalsNHashcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEmployeeMain {
    static void displayEmps(List<Employee> emps){
        for (Employee ee: emps){
            System.out.println(ee.getName());
        }
    }
    public static void main(String[] args) {
        // Example usage
        Employee employee1 = new Employee(1,"Johns Cena", 30);
        Employee employee2 = new Employee(2,"Janes Doe", 25);
        Employee employee3 = new Employee(3,"Alices Smith", 28);
        Employee employee4 = new Employee(4, "Bobs Johnson", 35);
        Employee employee5 = new Employee(5, "Charlies Brown", 40);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        displayEmps(employees);

        //Using Comparator Interface
        /*Collections.sort(employees, new Comparator<topics.sortingtraditionally.Employee>(){
            @Override
            public int compare(topics.sortingtraditionally.Employee e1, topics.sortingtraditionally.Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });*/

        //Using Lambda
        Collections.sort(employees, (e1, e2) ->
                e1.getName().compareTo(e2.getName())
        );
        System.out.println("=========================");
        displayEmps(employees);

    }
}
