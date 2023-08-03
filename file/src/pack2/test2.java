package pack2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class test2 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,4,32,3,4,3,2,1};
		
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new TreeSet<>();
		for(int i : arr) {
			if(list.contains(i)) {
				set.add(i);
			}
			else {
				list.add(i);
			}
		}
		list.clear();
		list.addAll(set);
		System.out.println(list);
	}
}

// 






































/*
      1			  1
      2 2       2 2
      3 3 3   3 3 3
      4 4 4 4 4 4 4
      5 5 5   5 5 5
      6 6		6 6
      7			  7
 */
