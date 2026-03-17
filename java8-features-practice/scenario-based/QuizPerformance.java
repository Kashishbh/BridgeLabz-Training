package review;

import java.util.*;

//Student Class
class Student {

 String name;
 String department;
 int q1, q2, q3;

 public Student(String name, String department, int q1, int q2, int q3) {
     this.name = name;
     this.department = department;
     this.q1 = q1;
     this.q2 = q2;
     this.q3 = q3;
 }

 public int totalScore() {
     return q1 + q2 + q3;
 }
}

//Quiz Service Class
class QuizService {

 List<Student> students = new ArrayList<>();

 public void addRecord(String name, String dept, int q1, int q2, int q3) {
     students.add(new Student(name, dept, q1, q2, q3));
     System.out.println("Record Added: " + name);
 }

 public void topDepartment(String dept) {

     if (students.isEmpty()) {
         System.out.println("No Records Available");
         return;
     }

     int max = -1;
     boolean found = false;

     for (Student s : students) {
         if (s.department.equals(dept)) {
             found = true;
             max = Math.max(max, s.totalScore());
         }
     }

     if (!found) {
         System.out.println("Department Not Found");
         return;
     }

     for (Student s : students) {
         if (s.department.equals(dept) && s.totalScore() == max) {
             System.out.println(s.name + " " + max);
         }
     }
 }

 public void topQuiz(String quiz) {

     if (students.isEmpty()) {
         System.out.println("No Records Available");
         return;
     }

     int max = -1;

     for (Student s : students) {

         int score = 0;

         if (quiz.equals("Q1")) score = s.q1;
         if (quiz.equals("Q2")) score = s.q2;
         if (quiz.equals("Q3")) score = s.q3;

         max = Math.max(max, score);
     }

     for (Student s : students) {

         int score = 0;

         if (quiz.equals("Q1")) score = s.q1;
         if (quiz.equals("Q2")) score = s.q2;
         if (quiz.equals("Q3")) score = s.q3;

         if (score == max) {
             System.out.println(s.name + " " + max);
         }
     }
 }
}

public class QuizPerformance {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     sc.nextLine();

     QuizService service = new QuizService();

     for (int i = 0; i < n; i++) {

         String line = sc.nextLine();
         String[] parts = line.split(" ");

         if (parts[0].equals("Record")) {

             String name = parts[1];
             String dept = parts[2];
             int q1 = Integer.parseInt(parts[3]);
             int q2 = Integer.parseInt(parts[4]);
             int q3 = Integer.parseInt(parts[5]);

             service.addRecord(name, dept, q1, q2, q3);

         } else if (parts[0].equals("Top")) {

             if (parts[1].startsWith("Q")) {
                 service.topQuiz(parts[1]);
             } else {
                 service.topDepartment(parts[1]);
             }
         }
     }

     sc.close();
 }
}