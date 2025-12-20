import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] height = new double[11];
        double sum= 0;
        for (int i= 0; i< height.length;i++) {
            height[i]= scan.nextDouble();
            sum+= height[i];
        }
        double meanHeight= sum/height.length;
        System.out.println("Mean Height = "+ meanHeight);
    }
}
