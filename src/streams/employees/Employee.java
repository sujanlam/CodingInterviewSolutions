package streams.employees;

public class Employee {
    private String name;
    private String position;
    private int yearsOfExperience;
    private int PTOs; // Paid Time Off
    private boolean leaveOfAbsence;
    private String department;

    // No-args constructor
    public Employee() {
    }

    // All-args constructor
    public Employee(String name, String position, int yearsOfExperience, int PTOs, boolean leaveOfAbsence, String department) {
        this.name = name;
        this.position = position;
        this.yearsOfExperience = yearsOfExperience;
        this.PTOs = PTOs;
        this.leaveOfAbsence = leaveOfAbsence;
        this.department = department;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getPTOs() {
        return PTOs;
    }

    public void setPTOs(int PTOs) {
        this.PTOs = PTOs;
    }

    public boolean isLeaveOfAbsence() {
        return leaveOfAbsence;
    }

    public void setLeaveOfAbsence(boolean leaveOfAbsence) {
        this.leaveOfAbsence = leaveOfAbsence;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
