package recursion;

public class FibonacciSeriesProblem {
    public static void printFibonacci(int a, int b, int termsLeft) {
        if (termsLeft <= 0) return;
        System.out.println(a);
        printFibonacci(b, a+b, termsLeft-1);
    }
    public static void main(String[] args) {
        int numTerms = 10;
        System.out.println("Fibonacci Series (First " + numTerms + " terms):");
        printFibonacci(0, 1, numTerms);
    }
}
