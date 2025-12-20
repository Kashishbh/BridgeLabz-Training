import java.util.Scanner;
class StudentAge {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] age= new int[10];
        for(int i=1;i<=age.length-1;i++){
            System.out.println("Enter Age of Student "+i+"=");
            age[i]=scan.nextInt();
            if(age[i]<0){
                System.out.println("Invalid age");
            }
            else if(age[i]>=18){
                System.out.println("The Student with age "+age[i]+" can vote ");
            }
            else{
                System.out.println("The Student with age "+age[i]+" can't vote");
            }
        }

    }
}
