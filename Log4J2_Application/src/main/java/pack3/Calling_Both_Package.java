package pack3;

import pack1.TestApp;

public class Calling_Both_Package {
	public static void main(String[] args) {
		TestApp test1 = new TestApp();
		test1.main(args);
		pack2.TestApp test2 = new pack2.TestApp();
		test2.main(args);
		System.out.println("done");
	}
}
