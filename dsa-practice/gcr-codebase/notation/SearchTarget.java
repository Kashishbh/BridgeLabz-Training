import java.util.Arrays;
public class SearchTarget{
    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        int target = 4;
        System.out.println("Linear Search Index: " + linearSearch(data, target));
        Arrays.sort(data);
        System.out.println("Binary Search Index: " + binarySearch(data, target));
    }
}
