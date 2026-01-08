class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = this;   // circular link
    }
}
class TaskList {
    TaskNode head;
    TaskNode current;

    void addAtStart(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = current = newNode;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    void addAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = current = newNode;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    void remove(int id) {
        if (head == null)
            return;

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void viewNextTask() {
        if (current == null)
            return;

        System.out.println(current.taskId + " " + current.taskName);
        current = current.next;
    }

    void search(int priority) {
        if (head == null)
            return;

        TaskNode temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.taskId + " " + temp.taskName);
            }
            temp = temp.next;
        } while (temp != head);
    }

    void display() {
        if (head == null)
            return;

        TaskNode temp = head;
        do {
            System.out.println(
                temp.taskId + " " +
                temp.taskName + " " +
                temp.priority + " " +
                temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }
}
public class TaskScheduler {
    public static void main(String[] args) {

        TaskList scheduler = new TaskList();

        scheduler.addAtStart(1, "Previous Year paper", 1, "24-01-2026");
        scheduler.addAtEnd(2, "Assignment", 2, "05-01-2026");
        scheduler.addAtEnd(3, "Project", 1, "25-01-2026");

        scheduler.display();
        scheduler.viewNextTask();
        scheduler.search(1);
        scheduler.remove(2);
        scheduler.display();
    }
}
