package recursion;

public class SumOneToTenProblem {
    public static int printSum(int num) {
        if (num == 1) return 1;

        return num + printSum(num-1);
    }
    public static void main(String[] args) {
        int result = printSum(10);
        System.out.println("Sum: " + result);
    }
}
