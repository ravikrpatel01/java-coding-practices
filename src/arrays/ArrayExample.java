package arrays;

import java.util.*;
public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {10, 25, 56, 255};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();
        System.out.println("N: " + N);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
