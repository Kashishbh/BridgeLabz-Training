public class EducationalCourse {
    static class Course {
        private String courseName;
        private int duration; 
        public Course(String courseName, int duration) {
            this.courseName = courseName;
            this.duration = duration;
        }
        public String getCourseName() {
            return courseName;
        }
        public int getDuration() {
            return duration;
        }
        public void displayDetails() {
            System.out.println("Course Name: " + courseName);
            System.out.println("Duration: " + duration + " hours");
        }
    }
    static class OnlineCourse extends Course {
        private String platform;
        private boolean isRecorded;

        public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
            super(courseName, duration);
            this.platform = platform;
            this.isRecorded = isRecorded;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Platform: " + platform);
            System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
        }
    }
    static class PaidOnlineCourse extends OnlineCourse {
        private double fee;
        private double discount;

        public PaidOnlineCourse(
                String courseName,
                int duration,
                String platform,
                boolean isRecorded,
                double fee,
                double discount
        ) {
            super(courseName, duration, platform, isRecorded);
            this.fee = fee;
            this.discount = discount;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Course Fee: ₹" + fee);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: ₹" + (fee - (fee * discount / 100)));
        }
    }
    public static void main(String[] args) {
        Course course = new PaidOnlineCourse(
                "Web Development",120,"Udemy",true,5000,10
        );
        course.displayDetails();
    }
}
