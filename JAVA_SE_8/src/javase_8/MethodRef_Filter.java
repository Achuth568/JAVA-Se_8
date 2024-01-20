package javase_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRef_Filter {

    static List<Emp> emps;

    public static void main(String[] args) {

        // Create a list of strings
        List<String> names = Arrays.asList("achuth", "jagath", "", "", "ejaz");

        // Count the number of empty strings in the list using a method reference
        long count = names.stream().filter(String::isEmpty).count();

        // Print the count to the console
        System.out.println(count); // 2

        // Filter the list to only include non-empty strings and print them to the console
        names.stream().filter(name -> name != "").forEach(System.out::println);

        // Filter the list of employees to only include employees with an ID greater than 10
        // using a method reference

        emps = Arrays.asList(new Emp(10, "achuth"), new Emp(20, "jagath"), new Emp(30, "ejaz"));

        emps.stream().filter(Emp::idCheck).forEach(System.out::println);

        // Create a new list of employees containing only employees with a name length
        // greater than 4 using a method reference and a stream

        List<Emp> e = emps.stream().filter(Emp::nameCheck).collect(Collectors.toList());

        // Print the new list of employees to the console
        System.out.println(e); // [Emp(id=20, name=jagath), Emp(id=30, name=ejaz)]

    }
}




