import java.util.Scanner;
public class QuickSortProductPrices {
    // Quick Sort method
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);
            // Sort elements before and after pivot
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }
    // Partition method
    private static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // pivot = last element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = scan.nextInt();
        int[] productPrices = new int[n];
        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            productPrices[i] = scan.nextInt();
        }
        quickSort(productPrices, 0, n - 1);
        System.out.println("Sorted Product Prices (Ascending):");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
    }
}
