package searching;

import java.util.Scanner;

public class LinearSearch {
    public static void linearSearch(int[] arr, int val) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println("Element found at index: " + i);
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("Element not found.");
    }
    public static void main(String[] args) {
        int[] arr = {12, 14, 15, 47, 23};
        int val = 15;

        linearSearch(arr, val);
    }
}
