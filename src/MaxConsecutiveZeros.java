public class MaxConsecutiveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
        int zeroCount = 0;
        int maxZeroCount = 0;

        for (int val : arr) {
            if (val == 0) {
                zeroCount += 1;
            }else{
                maxZeroCount = Math.max(maxZeroCount, zeroCount);
                zeroCount = 0;
            }
        }

        maxZeroCount = Math.max(maxZeroCount, zeroCount);

        System.out.println("Result: " + maxZeroCount);
    }
}
