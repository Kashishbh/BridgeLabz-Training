public class EmployeeManagement{
    static class Employee {
        private String name;
        private int id;
        private double salary;
        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public double getSalary() {
            return salary;
        }
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: " + salary);
        }
    }
    static class Manager extends Employee {
        private int teamSize;

        public Manager(String name, int id, double salary, int teamSize) {
            super(name, id, salary);
            this.teamSize = teamSize;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Team Size: " + teamSize);
        }
    }
    static class Developer extends Employee {
        private String programmingLanguage;

        public Developer(String name, int id, double salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage=programmingLanguage;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Programming Language: "+programmingLanguage);
        }
    }
    static class Intern extends Employee {
        private int durationMonths;

        public Intern(String name, int id, double salary, int durationMonths) {
            super(name, id, salary);
            this.durationMonths = durationMonths;
        }
        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Internship Duration: " + durationMonths + " months");
        }
    }
    public static void main(String[] args) {
        Employee manager= new Manager("kashish", 101, 90000, 10);
        Employee developer= new Developer("Navya", 102, 50000, "Java");
        Employee intern= new Intern("Divyanshi", 103, 12000, 6);
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
