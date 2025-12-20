import java.util.Scanner;

class NaturalNumSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        if (num>0) {
            int sum = num*(num+1)/2;
            System.out.println("The sum of "+num+" natural numbers is "+sum);
        } 
        else {
            System.out.println("The number "+num+"is not a natural number");
        }
    }
}
