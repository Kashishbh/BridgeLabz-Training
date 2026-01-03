public class SchoolSystem{
    static class Person {
        private String name;
        private int age;
        public Person(String name, int age) {
            this.name= name;
            this.age= age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        public void displayRole() {
            System.out.println("Role: Person");
        }
    }
    static class Teacher extends Person {
        private String subject;

        public Teacher(String name, int age, String subject) {
            super(name, age);
            this.subject= subject;
        }

        @Override
        public void displayRole() {
            System.out.println("Role: Teacher");
            System.out.println("Subject: " + subject);
        }
    }
    static class Student extends Person {
        private String grade;

        public Student(String name, int age, String grade) {
            super(name, age);
            this.grade= grade;
        }

        @Override
        public void displayRole() {
            System.out.println("Role: Student");
            System.out.println("Grade: " + grade);
        }
    }
    static class Staff extends Person {
        private String department;

        public Staff(String name, int age, String department) {
            super(name, age);
            this.department= department;
        }

        @Override
        public void displayRole() {
            System.out.println("Role: Staff");
            System.out.println("Department: "+department);
        }
    }
    public static void main(String[] args) {
        Person teacher= new Teacher("Mr. Bhatnagar", 40, "Physics");
        Person student= new Student("Kashish", 19, "12th Grade");
        Person staff= new Staff("Rishab", 30, "Administration");
        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();
        student.displayDetails();
        student.displayRole();
        System.out.println();
        staff.displayDetails();
        staff.displayRole();
    }
}
