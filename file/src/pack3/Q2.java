package pack3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {
	static int i = 10;
	static transient int j = 20;
}

public class Q2 {
	public static void main(String[] args) throws Exception {
		A a1 = new A();
		FileOutputStream f1 = new FileOutputStream("ABC.ser");
		ObjectOutputStream oos = new ObjectOutputStream(f1);
		oos.writeObject(a1);

		FileInputStream f2 = new FileInputStream("ABC.ser");
		ObjectInputStream ois = new ObjectInputStream(f2);
		A a = (A) ois.readObject();
		System.out.println(a.i + "  " + a.j);
		System.out.println("done");

	}
}
