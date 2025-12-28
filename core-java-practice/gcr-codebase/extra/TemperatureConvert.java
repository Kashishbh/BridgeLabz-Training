import java.util.Scanner;

class TemperatureConvert{

    // Fahrenheit to Celsius
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    // Celsius to Fahrenheit
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose option (1 or 2): ");
        int choice= scan.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = scan.nextDouble();
            double c = fahrenheitToCelsius(f);
            System.out.println("Temperature in Celsius: " + c);
        }
        else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double c = scan.nextDouble();
            double f = celsiusToFahrenheit(c);
            System.out.println("Temperature in Fahrenheit: " + f);
        }
        else {
            System.out.println("Invalid choice!");
        }
    }
}
