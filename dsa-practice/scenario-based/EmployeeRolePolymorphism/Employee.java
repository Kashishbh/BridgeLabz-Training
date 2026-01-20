package EmployeeRolePolymorphism;

public abstract class Employee {

    private final String name;
    private final double salary;

    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    protected double getSalary() {
        return salary;
    }

    // Polymorphic method
    public abstract double getBonus();
}
