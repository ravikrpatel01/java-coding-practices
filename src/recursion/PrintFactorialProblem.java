package recursion;

public class PrintFactorialProblem {
    public static int factorial(int num) {
        if (num == 1 || num == 0) return 1;
        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        int result = factorial(0);
        System.out.println("Factorial: " + result);
    }
}
