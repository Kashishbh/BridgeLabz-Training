package com.sonar.SonarQube;

public class AddTwoNum  {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Main method for manual testing
    public static void main(String[] args) {
    	AddTwoNum  calc = new AddTwoNum ();
        int result = calc.add(10, 20);
        System.out.println("Sum = " + result);
    }
}
