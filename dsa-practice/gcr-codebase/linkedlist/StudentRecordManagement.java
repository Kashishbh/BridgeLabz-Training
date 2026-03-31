class StudentNode {
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;
    StudentNode(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentLinkedList {
    StudentNode head;
    void addAtStart(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }
    void addAtEnd(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void studentDelete(int rollNo) {
        if (head == null)
            return;

        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    void studentSearch(int rollNo) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Searched Student found");
                System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Searched Student not found");
    }
    void gradeUpdate(int rollNo, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }
    void displayStudent() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}
public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addAtStart(1, "Kashish", 37, 'A');
        list.addAtEnd(2, "Navya", 45, 'B');
        list.addAtEnd(3, "Divyanshi", 17, 'C');
        list.displayStudent();
        System.out.println("-------------------------");
        list.studentDelete(3);
        list.studentSearch(2);
        list.gradeUpdate(2, 'A');
        System.out.println("After Updates:");
        list.displayStudent();
    }
}
