public class YardToMiles {
	public static double convertYardsToFeet(double yards) {
        double yardToFeet= 3;
        return yards*yardToFeet;
    }
    public static double convertFeetToYards(double feet) {
        double feetToYard= 0.333333;
        return feet * feetToYard;
    }
    public static double convertMetersToInches(double meters) {
        double meterToInches=39.3701;
        return meters*meterToInches;
    }
    public static double convertInchesToMeters(double inches) {
        double incheToMeters= 0.0254;
        return inches * incheToMeters;
    }  
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
	public static void main(String[] args) {
		System.out.println(convertYardsToFeet(5));
        System.out.println(convertFeetToYards(12));
        System.out.println(convertMetersToInches(2));
        System.out.println(convertInchesToMeters(20));
        System.out.println(convertInchesToCentimeters(10));
	}

}