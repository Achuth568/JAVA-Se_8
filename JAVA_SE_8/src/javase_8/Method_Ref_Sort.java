package javase_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Method_Ref_Sort {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("reck", "neck", "peck", "checck");

		// Sort the list using the String::compareTo method reference
		names.sort(String::compareTo);

		// Print the sorted list
		System.out.println(names);

		System.out.println("*******--------***********");

		// Create a list of Product objects
		List<Product> products = Arrays.asList(new Product(101, "choco", 50L), new Product(102, "biscuit", 100));

		// Approach 1: Sort the list using a Comparator comparing the product names
		products.sort(Comparator.comparing(Product::getPname));

		// Print the sorted list
		products.forEach(System.out::println);

		System.out.println("*******-----------*************");

		// Approach 2: Sort the list using a method reference to the Product::getPname method
		products.sort(Comparator.comparing(Product::getPname));

		// Print the sorted list
		products.forEach(System.out::println);

		System.out.println("*******--------------**************");

		// Approach 3: Sort the list in reverse order by product name
		products.sort(Comparator.comparing(Product::getPname).reversed());

		// Print the sorted list
		products.forEach(System.out::println);

		System.out.println("*******--------------**************");

		// Approach 4: Sort the list by product ID using a stream
		products.stream().sorted(Comparator.comparing(Product::getPid)).forEach(System.out::println);

	}
}
