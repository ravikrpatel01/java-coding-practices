import java.util.Arrays;

public class ArraysContainsSameElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1, 4};

        boolean flag = true;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Arrays elements are not same.");
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Arrays elements are same.");
        }
    }
}
