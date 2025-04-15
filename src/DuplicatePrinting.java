import java.util.*;

public class DuplicatePrinting {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        int[] arr = {1, 2, 2, 3, 4, 5, 6, 5, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            set.add(val);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        System.out.println("Unique Elements: " + set);
        System.out.println("HashMap: " + map);
        List<Integer> al = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                al.add(key);
            }
        }

        System.out.println("Duplicate Elements: " + al);
    }
}
