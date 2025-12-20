import java.util.Scanner;
class Grade {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int phy=scan.nextInt();
        int chem=scan.nextInt();
        int maths=scan.nextInt();
        double avg=(phy+chem+maths)/3.0;
        System.out.println("Average Marks: "+ avg);
        if (avg>=90)
            System.out.println("Grade: A | Remark: Excellent");
        else if (avg>=75)
            System.out.println("Grade: B | Remark: Very Good");
        else if (avg>=60)
            System.out.println("Grade: C | Remark: Good");
        else if (avg>=40)
            System.out.println("Grade: D | Remark: Pass");
        else
            System.out.println("Grade: F | Remark: Fail");
    }
}
