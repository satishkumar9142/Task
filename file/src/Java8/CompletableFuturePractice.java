package Java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CompletableFuturePractice {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		//		ExecutorService service =  Executors.newFixedThreadPool(10);
		//		Future<String> result  = service.submit(()-> executeTask());
		//		String finalresult = result.get();
		//		String concationateresult = finalresult.concat(" Kumar");
		//		System.out.println(concationateresult);


		// Blocked
		// No changing of result or future
		// No better Exception handling
		// In time out provide default value --> java 9
		// manually you can complete the future

		CompletableFuture<String> result = CompletableFuture.supplyAsync(()->executeTask());
	//	CompletableFuture<String> result1 = result.thenApply(data-> data.concat(" Kumar ")).thenApply(data->data.concat("fdshf"));
		
//		CompletableFuture<String> result1 = result.handle((rs,exception)->{
//			if(exception != null)
//				return "exception";
//			return rs;
//		});
		 
		CompletableFuture<String> result1 = result.completeOnTimeout("Default value", 1000, TimeUnit.MILLISECONDS);
		System.out.println(result1.get());
		
		
		CompletableFuture<String> com = new CompletableFuture().completedFuture("Hello World!!!"); // create the Thread of the every time when we create an object of Completable Future 
		String s = com.get();
		System.out.println(s);
		
		
		CompletableFuture.runAsync(()->{
			System.out.println("Runnable interface");
		});
		System.out.println("===========================");
		CompletableFuture.runAsync(()->{
			System.out.println("Runnable interface 2");}
		,Executors.newFixedThreadPool(1));
		
		System.out.println("=============================");
		
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(()->"Hello World!!!!!");
		System.out.println(supplyAsync.get());
		System.out.println("==================================");
		CompletableFuture<String> supplyAsync2 = CompletableFuture.supplyAsync(()->{
			return "Hello Worlds!!!!!!";},Executors.newCachedThreadPool()
		);
		System.out.println(supplyAsync2.get());
		

	}
	 
	
	
	
	public static String executeTask() {
		try {
			//int a = 10/0;
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "Satish";
	}
}
