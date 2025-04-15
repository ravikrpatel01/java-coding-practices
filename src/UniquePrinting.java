import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniquePrinting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 6, 5, 1};

        Set<Integer> set = new HashSet<>();
        List<Integer> al = new ArrayList<>();

        for (int val : arr) {
            if (!set.add(val)) {
                al.add(val);
            }
        }

        System.out.println("Unique Elements: " + set);
        System.out.println("Duplicate Elements: " + al);
    }
}
