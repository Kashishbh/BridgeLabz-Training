class Course {
    private String courseName;
    private int duration;      
    private double fee;
    private static String instituteName = "GLA University";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;   
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration (months): " + duration);
        System.out.println("Course Fee: " + fee);
    }
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
    public static void main(String[] args) {
        Course course1 = new Course("B.Tech CSE", 48, 120000.0);
        Course course2 = new Course("MCA", 24, 90000.0);
        course1.displayCourseDetails();
        System.out.println("------------------");
        course2.displayCourseDetails();
        System.out.println("==================");
        Course.updateInstituteName("GLA Institute of Technology");
        course1.displayCourseDetails();
        System.out.println("------------------");
        course2.displayCourseDetails();
    }
}
