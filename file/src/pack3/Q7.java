package pack3;

import java.io.File;

public class Q7 {
	public static void main(String[] args) {
		File f = new File("ABC.ser");

		f.delete();
		System.out.println("done");
	}

}
