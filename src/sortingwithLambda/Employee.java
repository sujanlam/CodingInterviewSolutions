package topics.sortingwithLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static void displayEmps(List<Employee> emps){
        for (Employee ee: emps){
            System.out.println(ee.getName());
        }
    }

    public static void main(String[] args) {
        // Example usage
        Employee employee1 = new Employee("Johns Cena", 30);
        Employee employee2 = new Employee("Janes Doe", 25);
        Employee employee3 = new Employee("Alices Smith", 28);
        Employee employee4 = new Employee("Bobs Johnson", 35);
        Employee employee5 = new Employee("Charlies Brown", 40);

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
