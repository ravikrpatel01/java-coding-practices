import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                ans[k++] = arr1[i++];
            }else {
                ans[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            ans[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            ans[k++] = arr2[j++];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 8, 9};
        int[] arr2 = {2, 3, 5, 10, 11};

        int[] ans = mergeTwoArray(arr1, arr2);

        System.out.println("Merged Sorted Array: " + Arrays.toString(ans));
    }
}
