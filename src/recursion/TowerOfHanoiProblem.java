package recursion;

public class TowerOfHanoiProblem {
    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("MOVE disk " + n + " from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("MOVE disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
