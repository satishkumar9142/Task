package pack2;

import java.util.HashMap;
import java.util.Map;

public class map {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 10, j = 20; i != j; i++, j--) {
			map.put(i, j);
		}
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(10));
		}
		System.out.println(map);
	}
}
