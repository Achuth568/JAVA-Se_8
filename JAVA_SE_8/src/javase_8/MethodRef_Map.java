package javase_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRef_Map {

    public static void main(String[] args) {

        // Create a list of strings
        List<String> lowerList = List.of("achuth", "ejaz", "jagath");

        // Convert the list of strings to uppercase using a method reference
        List<String> lower = MethodRef_Map.conversionUpper(lowerList);

        // Print the converted list to the console
        System.out.println(lower); // [ACHUTH, EJAZ, JAGATH]

        // Create a list of strings containing numbers
        List<String> stringList = List.of("1", "2", "3");

        // Convert the list of strings to integers using a method reference
        List<Integer> integer = MethodRef_Map.conversionInt(stringList);

        // Print the converted list to the console
        System.out.println(integer); // [1, 2, 3]

        // Create a list of employees
        List<Emp> emps = Arrays.asList(new Emp(10, "achuth"), new Emp(20, "ejaz"), new Emp(30, "jagath"));

        // Apply a map operation on the list of employees to get their names
        List<String> names = emps.stream().map(Emp::getName).collect(Collectors.toList());

        // Print the list of names to the console
        System.out.println(names); // [achuth, ejaz, jagath]

    }

    // Upper conversion
    public static List<String> conversionUpper(List<String> lowerList) {
        return lowerList.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    // Int conversion
    public static List<Integer> conversionInt(List<String> stringList) {
        return stringList.stream().map(Integer::valueOf).collect(Collectors.toList());
    }

}



