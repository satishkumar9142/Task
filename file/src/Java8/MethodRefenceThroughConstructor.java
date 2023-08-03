package Java8;

import java.util.List;

class Student1{
	String name;
	int rollno;
	int marks;
	int age;
	public Student1(String name, int rollno, int marks, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", rollno=" + rollno + ", marks=" + marks + ", age=" + age + "]";
	}
	
}
interface I3{
	
	public Student1 get(String name, int rollno,int marks, int age);
}
public class MethodRefenceThroughConstructor {

	public static void main(String[] args) {
		I3 s = Student1::new;
		Student1 stu = s.get("satish",10,87,23);
		System.out.println(stu);
	}
}
