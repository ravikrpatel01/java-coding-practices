public class MaxSubArraySumChallengeKadaneAlgo {
    public static int maxSubarraySum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int val : arr) {
            currSum += val;
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {20, 1, -3, 4, -1, 2, 10, -5, 4};
        System.out.println("Max-Sum: " + maxSubarraySum(arr));
    }
}
