import java.util.Scanner;
public class ComputeTemperature {
	public  static double calculateWindChill(double temperature, double windSpeed) {
		double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed , 0.16);
		return windChill;	
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		double temperature = scan.nextDouble();
		double windSpeed = scan.nextDouble();
		System.out.print(calculateWindChill(temperature, windSpeed));
	}

}
