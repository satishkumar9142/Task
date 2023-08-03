package Java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String name;
	int eno;

	public Employee(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}

	@Override
	public String toString() {
		return name + ":" + eno;
	}
}

public class EmployeeSort {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Satish", 600));
		list.add(new Employee("Rahul", 150));
		list.add(new Employee("Akash", 100));
		list.add(new Employee("Sumit", 200));

		System.out.println(list);
		list.sort((a, b) -> b.eno - a.eno);
		System.out.println(list);

		list.sort((a, b) -> a.name.compareTo(b.name));
		System.out.println(list);
		
		Predicate<Employee> p1 = e->e.eno > 100;
		for(Employee e1 : list)
		System.out.println(e1 + " " +p1.test(e1));

	}
}
