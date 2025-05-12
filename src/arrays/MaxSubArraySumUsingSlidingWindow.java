package arrays;

import java.util.*;

public class MaxSubArraySumUsingSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 10, 3, 2, 8};
        int k = 4;
        int maxSum = 0;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Result: " + maxSum);
    }

    public static class ArraysContainsSameElements {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 4, 5};
            int[] arr2 = {5, 4, 3, 2, 1, 4};

            boolean flag = true;

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("Arrays elements are not same.");
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Arrays elements are same.");
            }
        }
    }

    public static class DuplicatePrinting {
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
}
