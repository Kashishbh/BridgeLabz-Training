import java.util.Scanner;
public class StoreAndSum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double[] values= new double[10];
        double total= 0.0;
        int index= 0;
        while (true) {
            System.out.print("Enter number: ");
            double num = scan.nextDouble();
            if (num<=0 || index== 10)
                break;
            values[index++]= num;
        }
        for (int i= 0; i< index;i++) {
            total+= values[i];
            System.out.println(values[i]);
        }
        System.out.println("Total= " + total);
    }
}
