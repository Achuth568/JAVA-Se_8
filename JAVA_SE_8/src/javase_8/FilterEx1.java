package javase_8;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEx1 {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = List.of(1, 2, 3, 4, 4, 2, 5, 6, 7, 8);

        // Filter and print even numbers
        numbers.stream()
               .filter(i -> i % 2 == 0) // Filter for even numbers
               .forEach(number -> System.out.println(number));

        // Collect even numbers into a list
        List<Integer> evenList = numbers.stream()
                                        .filter(i -> i % 2 == 0) // Filter for even numbers
                                        .collect(Collectors.toList());
        System.out.println("Even numbers collected as a list: " + evenList);

        // Collect even numbers into a set to remove duplicates
        Set<Integer> evenSet = numbers.stream()
                                      .filter(i -> i % 2 == 0) // Filter for even numbers
                                      .collect(Collectors.toSet());
        System.out.println("Even numbers collected as a set (removing duplicates): " + evenSet);

        // Count the number of even numbers
        long count = numbers.stream()
                            .filter(i -> i % 2 == 0) // Filter for even numbers
                            .count();
        System.out.println("Count of even numbers: " + count);

        // Find the first even number
        int num = numbers.stream()
                        .filter(i -> i % 2 == 0) // Filter for even numbers
                        .findFirst()
                        .get();
        System.out.println("The first even number: " + num);

        // Find the nth even number (skip the first 2 even numbers)
        int n = numbers.stream()
                      .filter(i -> i % 2 == 0) // Filter for even numbers
                      .skip(2) // Skip the first 2 even numbers
                      .findFirst()
                      .get();
        System.out.println("The nth even number (skipping the first 2): " + n);
    }
}

	