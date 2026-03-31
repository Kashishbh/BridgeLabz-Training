import java.util.*;
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
class Student {
    private String name;
    private String[] subjects;
    private int[] marks;

    public Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
        validateMarks();
    }

    private void validateMarks() throws InvalidMarkException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Marks must be between 0 and 100.");
            }
        }
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public String assignGrade() {
        double avg = calculateAverage();
        if (avg >= 80) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 40) return "C";
        else return "Fail";
    }

    public void displayReport() {
        System.out.println("\nReport Card");
        System.out.println("Name: "+name);
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-15s : %3d%n", subjects[i], marks[i]);
        }
        System.out.println("-------------------------");
        System.out.printf("Average Marks : %.2f%n", calculateAverage());
        System.out.println("Grade         : " + assignGrade());
    }
}
public class StudentReport{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.print("Enter number of students: ");
        int n = scan.nextInt();
        scan.nextLine(); 
        System.out.print("Enter number of subjects: ");
        int subCount = scan.nextInt();
        scan.nextLine();
        String[] subjects = new String[subCount];
        for (int i = 0; i < subCount; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjects[i] = scan.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter student name: ");
            String name = scan.nextLine();
            int[] marks = new int[subCount];
            for (int j = 0; j < subCount; j++) {
                System.out.print("Enter marks for " + subjects[j] + ": ");
                marks[j] = scan.nextInt();
            }
            scan.nextLine();
            try {
                students.add(new Student(name, subjects, marks));
            } catch (InvalidMarkException e) {
                System.out.println(e.getMessage());
                i--; 
            }
        }
        for (Student s : students) {
            s.displayReport();
        }
    }
}
