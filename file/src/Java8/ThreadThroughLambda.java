package Java8;

//class MyRunnable implements Runnable{   // Functional Interface then we go for lambda expression
//	@Override
//	public void run() {
//		for(int i =0;i<10;i++) {
//			System.out.println("Child Thread");
//		}
//	}
//}
public class ThreadThroughLambda {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++)
			System.out.println("Main Thread");
	}
}
