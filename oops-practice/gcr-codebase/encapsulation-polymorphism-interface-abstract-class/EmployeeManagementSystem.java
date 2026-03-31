import java.util.*;
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
abstract class Employee implements Department {
    private int empId;
    private String name;
    private double baseSalary;
    private String deptName;
    public Employee(int employeeId, String name, double baseSalary) {
        this.empId = employeeId;
        this.name = name;
        setBaseSalary(baseSalary); 
    }
    public abstract double calculateSalary();
    public void displayDetail() {
        System.out.println("Employee ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Department: "+deptName);
        System.out.println("Salary: "+calculateSalary());
        System.out.println("---------------------------");
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }
    @Override
    public void assignDepartment(String departmentName) {
        this.deptName = departmentName;
    }
    @Override
    public String getDepartmentDetails() {
        return deptName;
    }
}
class FullTimeEmployee extends Employee {
    private double bonus;
    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();
        Employee e1 = new FullTimeEmployee(206, "Kashish", 40000, 4000);
        Employee e2 = new PartTimeEmployee(224, "Kanchan", 40000, 30);
        e1.assignDepartment("IT");
        e2.assignDepartment("HR");
        employees.add(e1);
        employees.add(e2);
        for (Employee emp :employees) {
            emp.displayDetail();
        }
    }
}
