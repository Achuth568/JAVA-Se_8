package javase_8;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        // Create a list of sublists
        List<List<Integer>> sublist = List.of(List.of(1, 2, 3, 4), List.of(5, 6, 7, 8));

        // Print the sublist
        System.out.println(sublist);

        // Use the flatMap() operation to flatten the sublist into a single list
        List<Integer> list = sublist.stream().flatMap(Collection::stream).collect(Collectors.toList());

        // Print the flattened list
        System.out.println(list);

        // Create a set of subsets
        Set<Set<Integer>> subset = Set.of(Set.of(1, 2, 3, 4, 5), Set.of(4, 5, 6, 7, 8));

        // Print the subset
        System.out.println(subset);

        // Use the flatMap() operation to flatten the subset into a single set
        Set<Integer> set = subset.stream().flatMap(Collection::stream).collect(Collectors.toSet());

        // Print the flattened set
        System.out.println(set);

        // Create a list of maps
        List<Map<Integer, String>> mapset = List.of(Map.of(100, "achuth", 102, "ap", 103, "bht"),
                Map.of(200, "jagath", 201, "ts", 202, "amp"));

        // Print the list of maps
        System.out.println(mapset);

        // Use the flatMap() operation to flatten the list of maps into a single list of map entries
        List<Map.Entry<Integer, String>> flattenedList = mapset.stream().flatMap(data -> data.entrySet().stream())
                .collect(Collectors.toList());

        // Print the flattened list of map entries
        System.out.println(flattenedList);

    }

}

