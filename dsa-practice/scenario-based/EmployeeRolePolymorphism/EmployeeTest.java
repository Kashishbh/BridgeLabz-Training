package EmployeeRolePolymorphism;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee manager = new Manager("Alice", 80000);
        System.out.printf("%.2f%n", manager.getBonus()); // 8000.00

        Employee devHigh = new Developer("Bob", 60000);
        System.out.printf("%.2f%n", devHigh.getBonus()); // 3000.00

        Employee devLow = new Developer("Charlie", 40000);
        System.out.printf("%.2f%n", devLow.getBonus()); // 0.00
    }
}
