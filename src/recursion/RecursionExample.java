package recursion;

public class RecursionExample {
    private static void printData(int n) {
        if (n > 5) return;
        System.out.println(n);
        printData(n + 1);
    }

    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 100: ");
        printData(1);
    }
}
