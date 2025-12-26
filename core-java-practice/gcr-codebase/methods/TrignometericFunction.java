public class TrignometericFunction{
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians= Math.toRadians(angle);
        double sine= Math.sin(radians);
        double cosine= Math.cos(radians);
        double tangent= Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args) {
        TrignometericFunction calc = new TrignometericFunction();
        double angle=45;
        double[] result= calc.calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }
}
