package arrays;

import java.util.ArrayList;
import java.util.List;

public class WithoutHashSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 6, 5, 1, 3};
        boolean[] boolArr = new boolean[100];

        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> duplicateList = new ArrayList<>();

        for (int j : arr) {
            if (!boolArr[j]) {
                uniqueList.add(j);
                boolArr[j] = true;
            } else {
                duplicateList.add(j);
            }
        }

        System.out.println("Unique Elements: " + uniqueList);
        System.out.println("Duplicate Elements: " + duplicateList);
    }
}
