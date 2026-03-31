import java.util.Scanner;
public class HeapSortSalary {
    // Heap Sort method
    public static void heapSort(int[] salaries) {
        int n = salaries.length;
        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }
        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            // Heapify reduced heap
            heapify(salaries, i, 0);
        }
    }
    // Heapify a subtree rooted at index i
    private static void heapify(int[] salaries, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heapSize && salaries[left] > salaries[largest]) {
            largest = left;
        }

        if (right < heapSize && salaries[right] > salaries[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            // Recursively heapify affected subtree
            heapify(salaries, heapSize, largest);
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of job applicants: ");
        int n = scan.nextInt();
        int[] salaryDemands = new int[n];
        System.out.println("Enter expected salary demands:");
        for (int i = 0; i < n; i++) {
            salaryDemands[i] = scan.nextInt();
        }
        heapSort(salaryDemands);
        System.out.println("Sorted Salary Demands (Ascending):");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}
