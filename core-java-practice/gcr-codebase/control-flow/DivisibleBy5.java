import java.util.Scanner;
class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int number=scan.nextInt();
        if(number%5==0){
            System.out.println("the number "+number+" is divisible by 5");
        }
        else{
            System.err.println("Not Divisible");
        }
    }
}
