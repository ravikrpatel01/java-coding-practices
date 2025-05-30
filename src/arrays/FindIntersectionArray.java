package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersectionArray {
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (int val : intersection) {
            result[i++] = val;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4, 5};

        int[] result = findIntersection(nums1, nums2);
        System.out.println("Intersection Array: " + Arrays.toString(result));
    }
}
