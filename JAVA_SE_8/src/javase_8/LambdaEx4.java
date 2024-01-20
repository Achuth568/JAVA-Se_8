package javase_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LambdaEx4 {

    public static void main(String[] args) {
        // Create a list of names and use forEach to print each name
        List<String> names = Arrays.asList("achuth", "jagath", "ejaz");
        names.forEach(name -> System.out.println(name));

        // Create a list of numbers and use forEach to print each number
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        numbers.forEach(number -> System.out.println(number));

        // Create a list of Emp objects and use forEach to print each employee's details
        List<Emp> emps = Arrays.asList(new Emp(10, "achuth"), new Emp(20, "ejaz"), new Emp(30, "jagath"));
        emps.forEach(emp -> System.out.println(emp.eid + " " + emp.name));

        // Create a set of colors and use forEach to print each color
        Set<String> colors = Set.of("pink", "white");
        colors.forEach(color -> System.out.println(color)); // Note: Sets may not maintain the order of elements

        // Create a map of word counts and use forEach to print key-value pairs
        Map<Integer, String> wordcount = Map.of(1, "achuth", 2, "jagath");
        wordcount.forEach((k, v) -> System.out.println(k + ": " + v));

        // Create a map of Emp objects and use forEach to print key and employee details
        Map<Integer, Emp> print = Map.of(1, new Emp(10, "achurh"), 2, new Emp(20, "jagath"));
        print.forEach((k, v) -> System.out.println(k + " " + v.eid + " " + v.name));
    }
}
