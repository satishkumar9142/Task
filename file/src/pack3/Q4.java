package pack3;

public class Q4 {
	/*
	 * public static class myThread extends Thread { public void run() { for(int i
	 * =0;i<10;i++) { System.out.println(i); } } }
	 */

	/*
	 * public static class myRunnable implements Runnable{ public void run() {
	 * for(int i =0;i<10;i++) { System.out.println(i); } } }
	 */

	public static void main(String[] args) {
//		myThread th = new myThread();
//		th.start();
//		Thread th = new Thread(new myRunnable());
//		th.start();
		/*
		 * Runnable runnable = new Runnable() {
		 * 
		 * @Override public void run() { for(int i =0;i<10;i++) { System.out.println(i);
		 * } } };
		 */

		/*
		 * Runnable runnable = () ->{ for(int i =0;i<10;i++) { System.out.println(i); }
		 * };
		 */

		Runnable runnable = () -> {
			System.out.println("start Runnable");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("end Runnable");
		};

		Thread th = new Thread(runnable);
		th.start();
	}
}
