package pack3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Q12 { // sender
	public static void main(String[] args) throws Exception {
		Dog1 d1 = new Dog1();
		FileOutputStream fos = new FileOutputStream("serial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
	}
}
