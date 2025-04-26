package stream_api;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        Stream<Object> emptyStream = Stream.empty();
        String[] names = {"Ravi", "Riva", "Anshika", "Ankit", "Yash"};
        Stream<String> stream = Stream.of(names);

        stream.forEach(name -> System.out.println(name));

        IntStream stream1 = Arrays.stream(new int[] {10, 20, 30, 40});
        stream1.forEach(val -> System.out.println(val));
    }
}
