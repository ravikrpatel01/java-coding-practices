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
}
