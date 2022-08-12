package examples.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner {

	public static void main(String[] args) {
		//1.
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Sam");
		names.add("James");
		
		List<String> result = names.stream()
			.filter(str -> !str.equals("James"))
			.map(str -> "Hello " + str)
			.collect(Collectors.toList());
		
		for(String str : result) {
			System.out.println(str);
		}
		
		//2.
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);

		int product = numbers.stream().reduce((num, acc) -> num * acc).get();
		System.out.println(product);
		
		//3.
		List<Integer> nums = Arrays.asList(3, 4, 5, 6);
		int max = nums.stream().mapToInt(i -> i).max().getAsInt();
		System.out.println(max);
		
		int min = IntStream.of(3, 4, 5, 6).min().getAsInt();
		System.out.println(min);
	}

}
