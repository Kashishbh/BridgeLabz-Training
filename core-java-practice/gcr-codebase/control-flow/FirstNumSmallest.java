import java.util.Scanner;
class FirstNumSmallest{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("Is the first number the smallest? = Yes");
        }
        else{
            System.out.println("Is the first number the smallest? = No");
        }
    }
}