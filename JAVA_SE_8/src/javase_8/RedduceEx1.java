package javase_8;

import java.util.Arrays;
import java.util.List;

public class RedduceEx1 {

	public static void main(String[] args) {

		// reduce -> perform the operations on all the elements return one value

		// by using reduce print the whole addition
		List<Integer> prices = List.of(72, 31, 43, 60, 57);
		int res = prices.stream().reduce((price1, price2) -> price1 + price2).get();
		System.out.println(res);

		// names start with a or e and length is 4 and add +"IT" to the name and print
		// the length whole string
		List<String> names = Arrays.asList("achuth", "ejaz", "jagath");

		int result = names.stream().filter(name -> (name.startsWith("a") || name.startsWith("e")) && name.length() == 4)
				.map(name -> name + "IT").reduce((name1, name2) -> name1 + name2).get().length();
		System.out.println(result);

		// filter greater than 15 and multiply with 10 and addition
		List<Integer> numbers = List.of(10, 20, 30, 40, 50);
		int sum = numbers.stream().filter(number -> number > 15).map(number -> number * 10).reduce((n1, n2) -> n1 +n2)
				.get();
		System.out.println(sum);

	}

}
