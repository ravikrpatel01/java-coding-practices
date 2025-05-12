package recursion;

public class FindNCRProblem {
    public static int findFactorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * findFactorial(num-1);
    }
    public static int findNCR(int n, int r) {
        if (n < r) return 0;

        int factN = findFactorial(n);
        int factR = findFactorial(r);
        int factNMinusR = findFactorial(n-r);

        return factN / (factR * factNMinusR);
    }
    public static void main(String[] args) {
        int n = 4;
        int r = 2;

        System.out.println("Total combinations: " + findNCR(n, r));
    }
}
