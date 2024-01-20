package javase_8;

import java.util.Arrays;
import java.util.List;

public class SortEx2 {

	public static void main(String[] args) {
		// Create a list of Emp objects
		List<Emp> emps = Arrays.asList(new Emp(10, "achuth"), new Emp(20, "ejaz"), new Emp(30, "jagath"));

		// Sort the list by eid in ascending order
		emps.sort((e1, e2) -> e1.eid.compareTo(e2.eid));

		// Print the sorted list
		emps.forEach(emp -> System.out.println(emp));

		/*
		 * Suppose null data passes through in the object this method shows null pointer
		 * exception
		 */

		// Sort the list by eid in descending order
		emps.sort((e1, e2) -> -e1.eid.compareTo(e2.eid));

		// Print the sorted list
		emps.forEach(emp -> System.out.println(emp));

		// Sort the list by eid in ascending order and filter the eid>10
		emps.stream().filter(emp -> emp.eid > 10).sorted((e1, e2) -> e1.eid.compareTo(e2.eid))
				.forEach(emp -> System.out.println(emp));

		// Sort the list by eid in ascending order and filter the eid>10 and handle null data
		emps.stream().filter(emp -> emp != null).filter(emp -> emp.eid > 10)
				.sorted((e1, e2) -> e1.eid.compareTo(e2.eid)).forEach(emp -> System.out.println(emp));
	}
}
