package javase_8;

/* sorting must follow  2 rules ->data must be homogeneous and implements comparable interface.
 *   
 * In java only string,all wrapper classes are implements comparable
 * 
 * the sorting is using compareTo() method.
 * 
 * three ways
 * 
 * ->collections.sort()
 * 
 * ->list.sort()
 * 
 * ->stream.sort()
 * 
 * */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEx1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("achuth", "ejaz", "jagath");

        System.out.println("****  APPROACH -1 ****");

        // Sorting in ascending order using Collections.sort()
        Collections.sort(names);
        System.out.println(names);

        // Sorting in descending order using Collections.sort() and a custom comparator
        Collections.sort(names, Comparator.reverseOrder());
        System.out.println(names);

        System.out.println("***** APPROACH -2 *****");

        // Sorting in ascending order using List.sort() and a lambda expression
        names.sort((name1, name2) -> name1.compareTo(name2));
        System.out.println(names);

        // Sorting in descending order using List.sort() and a lambda expression
        names.sort((name1, name2) -> -name1.compareTo(name2));
        System.out.println(names);

        System.out.println("****APPROACH -3****");

        // Sorting in ascending order using stream().sorted()
        names.stream().sorted().forEach(name -> System.out.println(name));
        System.out.println();

        // Sorting in descending order using stream().sorted() and a custom comparator
        names.stream().sorted((name1, name2) -> -name1.compareTo(name2)).forEach(name -> System.out.println(name));
        System.out.println();

        // Filtering names that start with "a" and sorting them
        names.stream().filter(name -> name.startsWith("a")).sorted().forEach(name -> System.out.println(name));
    }
}

