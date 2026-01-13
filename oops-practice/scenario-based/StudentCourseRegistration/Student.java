package StudentCourseRegistration;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person {

    private static final int MAX_COURSES = 3;
    private Map<Course, String> grades = new HashMap<>();

    public Student(int id, String name) {
        super(id, name);
    }

    public void enrollCourse(Course course) throws CourseLimitExceededException {
        if (grades.size() >= MAX_COURSES) {
            throw new CourseLimitExceededException("Course limit exceeded!");
        }
        grades.put(course, "Not Assigned");
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void dropCourse(Course course) {
        grades.remove(course);
        System.out.println(name + " dropped " + course.getCourseName());
    }

    public void assignGrade(Course course, String grade) {
        grades.put(course, grade);
    }

    public void viewGrades() {
        System.out.println("\nGrades for " + name);
        for (Map.Entry<Course, String> entry : grades.entrySet()) {
            System.out.println(entry.getKey().getCourseName()
                    + " : " + entry.getValue());
        }
    }
}

