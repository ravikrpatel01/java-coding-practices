package recursion;

public class PascalsTriangle {
    public static int pascalValue(int n, int r) {
        if (n == r || r == 0) return 1;
        return pascalValue(n - 1, r - 1) + pascalValue(n - 1, r);
    }

    public static void printPascalsTriangle(int numRows) {
        int maxDigits = String.valueOf(pascalValue(numRows - 1, (numRows - 1) / 2)).length();

        for (int i = 0; i < numRows; i++) {
            for (int k = 0; k < numRows - i - 1; k++) {
                for (int s = 0; s < maxDigits; s++) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%" + maxDigits + "d", pascalValue(i, j));
                if (j < i && maxDigits == 1) {
                    System.out.print(" ");
                } else if (j < i && maxDigits == 2) {
                    System.out.print("  ");
                } else if (j < i && maxDigits == 3) {
                    System.out.print("   ");
                } else if (j < i && maxDigits == 4) {
                    System.out.print("    ");
                } else if (j < i && maxDigits == 5) {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 10;
        printPascalsTriangle(numRows);
    }
}