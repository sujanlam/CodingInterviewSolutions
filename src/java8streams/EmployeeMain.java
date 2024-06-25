import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        // Create a list of Employee objects using Arrays.asList()
        List<Employee> employees = Arrays.asList(
                new Employee("Alice Smith", "Software Engineer", 5, 20, false, "Engineering"),
                new Employee("Bob Johnson", "Product Manager", 8, 15, false, "Product"),
                new Employee("Charlie Brown", "UX Designer", 3, 25, true, "Design"),
                new Employee("Diana Prince", "QA Engineer", 2, 10, false, "Quality Assurance"),
                new Employee("Evan Wright", "Data Scientist", 6, 1, false, "Data Science"),
                new Employee("John Wonda", "Data Scientist", 4, 30, true, "Data Science")
        );
        Map<String, Double> avgExpPerDept = calculateAverageExpPerDept(employees);
        List<String> onLeaveEmployees = getEmployeesOnLeave(employees);
        String deptWithHighestPTOs = getDeptWithHighestAvgPTOs(employees);

        System.out.println("Average years of experience per dept: " + avgExpPerDept);
        System.out.println("Employees currently on leave: " + onLeaveEmployees);
        System.out.println("Dept with highest average PTOs: " + deptWithHighestPTOs);
    }

    //TASK1 = calculateAverageExpPerDept
    public static Map<String, Double> calculateAverageExpPerDept(List<Employee> employees){
        Map<String, Double> avgExpPerDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getYearsOfExperience)));
        return avgExpPerDept;
    }

    //TASK2 = getEmployeesOnLeave
    public static List<String> getEmployeesOnLeave(List<Employee> employees){
        List<Employee> employeesOnLeave = employees.stream().filter(employee -> employee.isLeaveOfAbsence()).collect(Collectors.toList());
        List<String> listOfEmpsOnLeave = employeesOnLeave.stream().map(employee -> employee.getName()).collect(Collectors.toList());
        return listOfEmpsOnLeave;
    }
    //TASK3 = getDeptWithHighestAvgPTOs
    public static String getDeptWithHighestAvgPTOs(List<Employee> employees){
        String deptWithHighestAvgPTOs = "";
        Map<String, Double> highestAvgPTO = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getPTOs)));

        return highestAvgPTO.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("No department found");
    }
}
