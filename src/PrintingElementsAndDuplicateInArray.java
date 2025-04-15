public class PrintingElementsAndDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 0};
        int size = arr.length;

        System.out.print("Unique Elements: ");
        for(int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = i+1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print("\nDuplicate Elements: ");
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = i+1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            boolean isAlreadyPrinted = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    isAlreadyPrinted = true;
                    break;
                }
            }
            if (isDuplicate && !isAlreadyPrinted) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
