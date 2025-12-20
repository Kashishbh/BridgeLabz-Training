import java.util.Scanner;
class LargestNum{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Is the first number the largest? = Yes"+"\n"+"Is the second number the largest? = No"+"\n"+"Is the third number the largest? = No");
        }
        if(num2>num1&& num2>num3){
            System.out.println("Is the first number the largest? = No"+"\n"+"Is the second number the largest? = Yes"+"\n"+"Is the third number the largest? = No" );
        }
        if(num3>num1&&num3>num2){
            System.out.println("Is the first number the largest? = No"+"\n"+"Is the second number the largest? = No"+"\n"+"Is the third number the largest? = Yes");
        }
    }
}