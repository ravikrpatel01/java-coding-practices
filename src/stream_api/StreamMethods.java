package stream_api;

import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {
        List<String> names = List.of("Ravi", "Riva", "Aman", "Ashish", "Ramesh", "Ranjan");
        System.out.println("Names start with R: ");
        names.stream().filter(name -> name.startsWith("R"))
                .forEach(name -> System.out.println(name));

        System.out.println("Names having 4 character length: ");
        names.stream().filter(name -> name.length() == 4)
                .forEach(name -> System.out.println(name));

        List<Integer> l1 = List.of(12, 28, 25, 36);
        int result = l1.stream().reduce((acc, prev) -> acc + prev).get();
        System.out.println("Reduce: " + result);

        List<Integer> sortedResult = l1.stream().sorted().toList();
        System.out.println("Sorted: " + sortedResult);

        int minValue = l1.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min-Value: " + minValue);

        int maxValue = l1.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max-Value: " + maxValue);
    }
}
