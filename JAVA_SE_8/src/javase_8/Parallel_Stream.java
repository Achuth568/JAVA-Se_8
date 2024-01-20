package javase_8;

import java.util.List;
import java.util.stream.Collectors;

public class Parallel_Stream {

	public static void main(String[] args) {

		// Create a list of numbers
		List<Integer> list = List.of(221, 976, 44, 884, 743, 932, 764, 672);

		// Print the elements of the sequential stream
		list.stream().forEach(System.out::println);

		// Print the elements of the parallel stream
		list.parallelStream().forEach(System.out::println);

		// Calculate the time it takes to filter the sequential stream
		long start = System.currentTimeMillis();

		List<Integer> s = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		long end = System.currentTimeMillis();

		// Print the time it takes to filter the sequential stream
		System.out.println(end - start);

		// Calculate the time it takes to filter the parallel stream
		long pstart = System.currentTimeMillis();

		List<Integer> ps = list.parallelStream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		long pend = System.currentTimeMillis();

		// Print the time it takes to filter the parallel stream
		System.out.println(pend - pstart);

	}

}

