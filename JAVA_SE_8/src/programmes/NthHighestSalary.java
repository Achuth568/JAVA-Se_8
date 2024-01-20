package programmes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		int num=2;

		map.put("c", 10000);
		map.put("b", 15000);
		map.put("a", 1000);
		map.put("d", 7000);
		map.put("e", 10000);
		
		/*
		 * it has an exception ,suppose the map has duplicative data it returns one value
		 * like two persons have equal salary it returns only one of them.
		 * 

		Map.Entry<String, Integer> result = map.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(num-1);

		System.out.println(result);
		*/
		//writing Above one in method
		Map.Entry<String, Integer> result=getNthHighestSalary(num,map);
		System.out.println(result);
		
		
	}

	
		public static Map.Entry<String, Integer> getNthHighestSalary(int num,Map<String,Integer> map)
		{
			return map.entrySet().stream()
					.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(num-1);
		}

}
