package javase_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodRef_Reduce {

    public static void main(String[] args) {

        // Lambda expression using reduce
        List<Integer> prices = List.of(72, 31, 43, 60, 57);
        int res = prices.stream().reduce((price1, price2) -> price1 + price2).get();
        System.out.println(res); // 263

        // Method reference using reduce
        prices.stream().reduce(Integer::sum).ifPresent(System.out::println); // 263

        prices.stream().reduce(Integer::max).ifPresent(System.out::println); // 72

        prices.stream().reduce(Integer::min).ifPresent(System.out::println); // 31

        // Method reference using reduce to filter and sum the prices
        Integer threshold = 50;
        prices.stream().filter(((Predicate<Integer>) threshold::equals).or(i -> i > threshold)).reduce(Integer::sum)
                .ifPresent(System.out::println); // 230

        // Method reference using reduce to concat a list of strings
        List<String> names = Arrays.asList("achuth", "ejaz", "jagath");

        names.stream().reduce(String::concat).ifPresent(System.out::println); // "achuthejazjagath"

        // Method reference using reduce to count the number of strings in a list without null data
        List<String> fruits = Arrays.asList("apple", "", "banana", "", "grapes");

        long count = fruits.stream().filter(Predicate.not(String::isEmpty)).count();
        System.out.println(count); // 3

        // Method reference using reduce to filter, map, and sum the string lengths
        fruits.stream().filter(Predicate.not(String::isEmpty)).map(String::length).reduce(Integer::sum)
                .ifPresent(System.out::println); // 11
    }
}

