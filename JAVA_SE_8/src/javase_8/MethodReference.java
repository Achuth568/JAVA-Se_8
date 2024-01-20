package javase_8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {

		List<Emp> emps = Arrays.asList(new Emp(10, "achuth"), new Emp(20, "ejaz"), new Emp(30, "jagath"));

		// by using lambda
		emps.forEach(emp -> System.out.println(emp));

		// by using method reference to print
		emps.forEach(System.out::println);

		/*
		 * in java when we print the reference variable it automatically calls
		 * toString()
		 */

	}

}
