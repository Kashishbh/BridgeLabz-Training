class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    ProcessNode next;
    ProcessNode(int pid, int burstTime, int priority) {
        this.pid= pid;
        this.burstTime= burstTime;
        this.remainingTime= burstTime;
        this.priority= priority;
        this.next= this;  
    }
}
class RoundRobinList {
    ProcessNode head = null;
    int timeQuantum;
    RoundRobinList(int tq) {
        timeQuantum= tq;
    }
    void addProcess(int pid, int burst, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burst, priority);
        if (head == null) {
            head = newNode;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    void removeProcess(int pid) {
        if (head == null) return;
        ProcessNode curr = head;
        ProcessNode prev = null;
        do {
            if (curr.pid == pid) {
                if (curr == head) {
                    ProcessNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
    void display() {
        if (head == null) return;

        ProcessNode temp = head;
        do {
            System.out.println("PID: " + temp.pid +
                    " Remaining: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    void schedule() {
        if (head == null) return;
        int time = 0;
        int totalWT = 0, totalTAT = 0;
        int count = 0;
        ProcessNode current = head;
        while (head != null) {
            if (current.remainingTime > timeQuantum) {
                current.remainingTime -= timeQuantum;
                time += timeQuantum;
            } else {
                time += current.remainingTime;
                current.remainingTime = 0;
                int turnaroundTime = time;
                int waitingTime = turnaroundTime - current.burstTime;
                totalWT += waitingTime;
                totalTAT += turnaroundTime;
                count++;
                if (current.next == current) {
                    head = null;
                    break;
                }
                int finishedPid = current.pid;
                ProcessNode nextProcess = current.next;
                removeProcess(finishedPid);
                current = nextProcess;
                display();
                continue;
            }
            current = current.next;
            display();
        }
        System.out.println("Average Waiting Time: " + (double) totalWT / count);
        System.out.println("Average Turnaround Time: " + (double) totalTAT / count);
    }
}
public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {
        RoundRobinList rr = new RoundRobinList(3);
        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);
        rr.schedule();
    }
}
