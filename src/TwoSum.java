import java.util.Arrays;

public class TwoSum {
    public static int[] findTargetSum(int[] arr, int target) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (target == arr[i] + arr[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int targetSum = 188;

        int[] result = findTargetSum(arr, targetSum);

        System.out.println(Arrays.toString(result));
    }
}
