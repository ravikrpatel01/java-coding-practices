package arrays;

public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;

        for (int val : arr) {
            if (count == 0) {
                candidate = val;
            }
            count += (candidate == val) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2, 2};
        int result = majorityElement(arr);
        System.out.println("Majority Element: " + result);
    }
}
