import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 1, 4, 5, 3};
        System.out.println("Array Size: " + arr.length);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int val : arr) {
            hashMap.put(val, hashMap.getOrDefault(val, 0) + 1);
        }

        System.out.println(hashMap);

        for(int key : hashMap.keySet()) {
            if (hashMap.get(key) >= 2) {
                System.out.println(key + ":" + hashMap.get(key));
            }
        }
    }
}
