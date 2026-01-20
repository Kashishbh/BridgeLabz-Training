import java.util.*;
public class DataStructureSearching{
    public static void main(String[] args) {
        int target = 50;
        int[] arr = {10, 20, 30, 40, 50};
        for (int i : arr) {
            if (i == target) {
                System.out.println("Found in Array");
                break;
            }
        }
        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Found in HashSet: " + hashSet.contains(target));
        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Found in TreeSet: " + treeSet.contains(target));
    }
}
