package pack3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*class Animal implements Serializable{
	 int i =10;
}
class Dog  extends Animal{
	 int j =20;
} */

class Animal {
	int i = 10;

	public Animal() {
		System.out.println("Animal Constructor");
	}
}

class Dog extends Animal implements Serializable {
	int j = 20;

	public Dog() {
		System.out.println("Dog Constructor");
	}
}

public class Q9 {
	public static void main(String[] args) throws Exception {

		Dog b = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b);

		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog c = (Dog) ois.readObject();
		System.out.println(c.i + "  " + c.j);
	}
}
