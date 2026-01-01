class Employee {
    public int employeeID;         
    protected String department;    
    private double salary;        
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void updateSalary(double increment) {
        if (increment > 0) {
            salary += increment;
        }
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    private String role;
    public Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);  
        System.out.println("Department: " + department);   
        System.out.println("Role: " + role);
        System.out.println("Salary: " + getSalary());      
    }
    public static void main(String[] args) {
        Employee emp = new Employee(101, "IT", 45000);
        emp.displayEmployeeDetails();
        System.out.println("------------------");
        emp.updateSalary(5000);
        System.out.println("Updated Salary: " + emp.getSalary());
        System.out.println("==================");

        Manager mgr = new Manager(201, "HR", 70000, "Team Lead");
        mgr.displayManagerDetails();
    }
}
