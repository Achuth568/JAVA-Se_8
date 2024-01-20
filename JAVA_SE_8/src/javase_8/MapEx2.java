package javase_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MapEx2 {
    public static void main(String[] args) {
        // Create a list of Emp objects
        List<Emp> emps = Arrays.asList(new Emp(10, "achuth"), new Emp(20, "ejaz"), new Emp(30, "jagath"));

        // Get employee names and add " IT" to each name, then print the results
        emps.stream().map(emp -> emp.getName() + " IT").forEach(emp -> System.out.println(emp));

        // Filter employees with Eid > 10, add 100 to their Eid, and print the results
        emps.stream().filter(emp -> emp.getEid() > 10).map(emp -> {
            emp.setEid(emp.getEid() + 100);
            return emp;
        }).forEach(emp -> System.out.println(emp));

        // Create a list of names
        List<String> names = Arrays.asList("achuth", "ejaz", "jagath");

        System.out.println("****  APPROACH -1 ****");

        // Sorting names in ascending order
        Collections.sort(names);
        System.out.println(names);

        // Sorting names in descending order
        Collections.sort(names, Comparator.reverseOrder());
        System.out.println(names);

        System.out.println("***** APPROACH -2 *****");

        // Sorting names in ascending order using the List.sort method and a lambda expression
        names.sort((name1, name2) -> name1.compareTo(name2));
        System.out.println(names);

        // Sorting names in descending order using the List.sort method and a lambda expression
        names.sort((name1, name2) -> -name1.compareTo(name2));
        System.out.println(names);

        System.out.println("****APPROACH -3****");

        // Sorting names in ascending order using stream().sorted()
        names.stream().sorted().forEach(name -> System.out.println(name));
        System.out.println();

        // Sorting names in descending order using stream().sorted() and a custom comparator
        names.stream().sorted((name1, name2) -> -name1.compareTo(name2)).forEach(name -> System.out.println(name));
        System.out.println();

        // Filtering names that start with "a" and sorting them
        names.stream().filter(name -> name.startsWith("a")).sorted().forEach(name -> System.out.println(name));
    }
}


//using map without return it print specific column
//by using return we get all data can print