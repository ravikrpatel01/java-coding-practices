import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNoInEachSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        List<Integer> al = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            boolean foundNegative = false;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    foundNegative = true;
                    al.add(arr[j]);
                    break;
                }
            }

            if (!foundNegative) {
                al.add(0);
            }
        }

        System.out.println("Result: " + al);
    }
}
