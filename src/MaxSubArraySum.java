public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2, 8};
        int k = 3;
        int maxSum = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = arr[i];
            for (int j = i+1; j <= i+2; j++) {
                sum += arr[j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Sum: " + maxSum);
    }
}
