package searching;

public class BinarySearch {
    public static boolean binarySearch(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;

        boolean flag = false;
        while (start < end) {
            int mid = (start + end) / 2;

            if (val == arr[mid]) {
                flag = true;
                System.out.println("Element found at index: " + mid);
                break;
            } else if (val < arr[mid]) {
                end = mid;
            } else if (val > arr[mid]) {
                start = mid + 1;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        int[] arr = {12, 14, 35, 56, 58};
        int val = 32;

        boolean result = binarySearch(arr, val);
        if (!result) {
            System.out.println("Element not found.");
        }
    }
}
