import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int input) {
        long reversed = 0;

        while(input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int)reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Reversed Integer: " + reverse(n));
    }
}
