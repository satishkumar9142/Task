package pack3;

public class Q5 {

	public static class StoppableRunnable implements Runnable {

		private boolean stopRequested = false;

		public synchronized void requestStop() {
			this.stopRequested = true;
		}

		public synchronized boolean isStopRequested() {
			return this.stopRequested;
		}

		private void sleep(long millis) {

			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			System.out.println("StoppableRunnable Running");
			while (!isStopRequested()) {
				sleep(1000);
				System.out.println("------------");
			}
			System.out.println("stoppableRunnable Stopped");
		}
	}

	public static void main(String[] args) {
		StoppableRunnable stoppableRunnable = new StoppableRunnable();
		Thread thread = new Thread(stoppableRunnable, "The Thread");
		thread.start();

		try {
			thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Requesting stop");
		stoppableRunnable.requestStop();
		System.out.println("stop requested");
	}
}
