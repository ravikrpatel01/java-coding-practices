import java.util.ArrayList;
import java.util.Arrays;

// Remove duplicates from a sorted array (return new length)
public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicate(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                al.add(arr[i]);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 6, 1};
        ArrayList<Integer> ans = removeDuplicate(arr);

        System.out.println("Final Array: " + ans);
    }
}
