package JavaCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentResultGrouping {
    static class Student {
        String name;
        String gradeLevel;
        public Student(String name, String gradeLevel) {
            this.name = name;
            this.gradeLevel = gradeLevel;
        }
        public String getName() {
            return name;
        }
        public String getGradeLevel() {
            return gradeLevel;
        }
        @Override
        public String toString() {
            return "Student{name='" + name + "', gradeLevel='" + gradeLevel + "'}";
        }
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ron", "12th Grade"),
                new Student("Kaira", "10th Grade"),
                new Student("Kam", "10th Grade"),
                new Student("Danny", "12th Grade"),
                new Student("Emmy", "11th Grade")
        );
        // Group students by grade level and collect their names
        Map<String, List<String>> studentsByGrade = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println("Students grouped by grade level:");
        studentsByGrade.forEach((grade, names) ->
                System.out.println(grade + ": " + names)
        );
    }
}