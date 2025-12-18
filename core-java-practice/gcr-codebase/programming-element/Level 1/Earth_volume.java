public class Earth_volume {
    public static void main(String[] args) {
        double r = 6378;
        double pi = Math.PI;

        double volume_Km = (4.0 / 3) * pi * Math.pow(r, 3);
        double volume_Miles = volume_Km / Math.pow(1.609, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
                volume_Km + " and cubic miles is " + volume_Miles);
    }
}


