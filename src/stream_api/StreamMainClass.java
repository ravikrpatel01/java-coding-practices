package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Create a list of numbers and filter all even numbers.
public class StreamMainClass {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 21, 54, 23, 20, 200, 0);

        List<Integer> list2 = Arrays.asList(12, 45, 100, 23, 56, 230);
        System.out.println("Original List-1: " + list1);
        System.out.println("Original List-2: " + list2);

        // filter()
        List<Integer> result = list1.stream().filter(val -> val % 2 == 0).toList();
        System.out.println("Stream-API-Filter List-1: " + result);

        // map()
        List<Integer> result2 = list2.stream().map(val -> val%2 == 0? val*10 : val*5).toList();
        System.out.println("Stream-API-Map List-2: " + result2);
    }
}
