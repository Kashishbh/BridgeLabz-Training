package StudentCourseRegistration;
public class StudentCourseRegistrationSystem
implements RegistrationService {

@Override
public void registerCourse(Student student, Course course)
    throws CourseLimitExceededException {
student.enrollCourse(course);
}

@Override
public void dropCourse(Student student, Course course) {
student.dropCourse(course);
}

public static void main(String[] args) {

StudentCourseRegistrationSystem service =
        new StudentCourseRegistrationSystem();
Student student = new Student(12, "Kashish");
Course c1 = new Course(101, "JAVA");
Course c2 = new Course(102, "DSA");
Course c3 = new Course(103, "OOPS");
Course c4 = new Course(104, "ClOUD");

try {
    service.registerCourse(student, c1);
    service.registerCourse(student, c2);
    service.registerCourse(student, c3);
    service.registerCourse(student, c4); // Exception
} catch (CourseLimitExceededException e) {
    System.out.println(e.getMessage());
}

student.assignGrade(c1, "A");
student.assignGrade(c2, "A+");

student.viewGrades();

service.dropCourse(student, c2);
student.viewGrades();
}
}
