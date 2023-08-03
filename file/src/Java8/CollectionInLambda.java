package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionInLambda {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(41);
		list.add(51);
		list.add(91);
		list.add(71);
		list.add(80);
		list.add(90);
		System.out.println(list);
		Collections.sort(list, (a,b)-> b-a);  // Collections.sort
		list.sort((a, b) -> b - a); //  list.sort
		System.out.println(list);
		list.stream().forEach(System.out::println); // new version come in java 8 feature
		List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list2);
	}
}
