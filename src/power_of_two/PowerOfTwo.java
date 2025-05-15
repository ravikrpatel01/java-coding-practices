package power_of_two;

import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int num) {
        /*
        return num > 0 && (num & (num - 1)) == 0;
        */
        for (int i = 0; i <= num / 2; i++) {
            if (Math.pow(2, i) == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (isPowerOfTwo(num)) {
            System.out.println("Yes, " + num + " is power of 2.");
        } else {
            System.out.println("No, " + num + " is not power of 2.");
        }
    }
}
