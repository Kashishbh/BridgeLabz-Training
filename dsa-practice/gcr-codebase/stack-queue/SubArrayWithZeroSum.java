

import java.util.*;

public class SubArrayWithZeroSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findZeroSumSubarrays(arr));
    }

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> mp = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                result.add(new int[] { 0, i });
            }

            if (mp.containsKey(sum)) {
                for (int startIndex : mp.get(sum)) {
                    result.add(new int[] { startIndex + 1, i });
                }
            }

            mp.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }
}
