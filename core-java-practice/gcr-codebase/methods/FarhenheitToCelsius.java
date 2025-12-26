public class FarhenheitToCelsius {
	public static void main(String[] args) {
		System.out.println(convertFahrenheitToCelsius(100));
        System.out.println(convertCelsiusToFahrenheit(37));
        System.out.println(convertPoundsToKilograms(10));
        System.out.println(convertKilogramsToPounds(5));
        System.out.println(convertGallonsToLiters(2));
        System.out.println(convertLitersToGallons(10));
	}
	public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitTocelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheitTocelsius;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusTofahrenheit = (celsius * 9 / 5) + 32;
        return celsiusTofahrenheit;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double poundsTokilograms = pounds * 0.453592;
        return poundsTokilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsTopounds = kilograms * 2.20462;
        return kilogramsTopounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToliters = gallons * 3.78541;
        return gallonsToliters;
    }
    public static double convertLitersToGallons(double liters) {
        double litersTogallons = liters * 0.264172;
        return litersTogallons;
    }
}