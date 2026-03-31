package StudentCourseRegistration;
public interface RegistrationService {

    void registerCourse(Student student, Course course)
            throws CourseLimitExceededException;

    void dropCourse(Student student, Course course);
}
