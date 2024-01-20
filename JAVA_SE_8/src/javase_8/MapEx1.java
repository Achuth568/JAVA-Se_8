package javase_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx1 {

    public static void main(String[] args) {
        // Adding 2 to each number in the list and printing the result
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().map(number -> number + 2).forEach(print -> System.out.println(print));

        // Adding " IT" to each name in the list and printing the result
        List<String> names = Arrays.asList("achuth", "jagath");
        names.stream().map(name -> name + " IT").forEach(print -> System.out.println(print));

        // Filtering even numbers, multiplying by 10, and collecting the result
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenList = nums.stream().filter(f -> f % 2 == 0).map(number -> number * 10)
                .collect(Collectors.toList());
        System.out.println(evenList);

        // Filtering even numbers greater than 3, multiplying by 10, and collecting the result
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> nList = n.stream().filter(f -> f % 2 == 0).filter(j -> j > 3).map(number -> number * 10)
                .collect(Collectors.toList());
        System.out.println(nList);
    }
}
