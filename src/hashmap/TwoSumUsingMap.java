package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingMap {
    public static int[] findTargetSum(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

//        System.out.println(map);

        for (int i = 0; i < arr.length; i++) {
            int delta = target - arr[i];
            if (map.containsKey(delta)) {
                result[0] = i;
                result[1] = map.get(delta);
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int targetSum = 18;

        int[] result = findTargetSum(arr, targetSum);

        System.out.println(Arrays.toString(result));
    }
}
