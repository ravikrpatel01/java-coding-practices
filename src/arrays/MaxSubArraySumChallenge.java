package arrays;

public class MaxSubArraySumChallenge {
    public static void maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                maxSum = Math.max(currSum, maxSum);
            }
        }

        System.out.println("Max-Sum: " + maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {20, 1, -3, 4, -1, 2, 10, -5, 4};
        maxSubarraySum(arr);
    }
}
