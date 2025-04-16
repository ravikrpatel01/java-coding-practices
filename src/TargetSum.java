import java.util.Arrays;

public class TargetSum {
    public static void targetSum(int[] arr, int val) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == val) {
                    System.out.println("[" + i + "," + j + "]");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 10, 11};
        int target = 21;

        targetSum(arr, target);
    }
}
