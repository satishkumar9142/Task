package Java8;

import java.util.ArrayList;
import java.util.List;

public class stream {
	public static void main(String[] args) {
//		String[] names = {"Sam","Pamela", "Dave", "Pascal", "Erik"};
		List<String> names = new ArrayList<>();
		names.add("Sam");names.add("Pamela");names.add("Dave");names.add("Pascal");names.add("Erik");
		names.stream().forEachOrdered(e -> {
//        System.out.println(e.charAt(S) + " -> " + e.value());
	    });
	}
}
