import java.util.Scanner;

public class FeeDiscountUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fee;
        double dis_Percent;
        fee = sc.nextDouble();

        dis_Percent = sc.nextDouble();

        double discount = (fee * dis_Percent) / 100;
        double final_Fee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + final_Fee);
    }
}

