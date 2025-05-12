package recursion;

public class SumOfArrayElementsProblem {
    public static int calculateSum(int[] arr, int index) {
        if (index == 0) return arr[index];
        return arr[index] + calculateSum(arr, index-1);
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 47, 100, 56};
        int result = calculateSum(arr, arr.length-1);
        System.out.println("Sum: " + result);
    }
}
