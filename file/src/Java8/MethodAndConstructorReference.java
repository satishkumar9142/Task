package Java8;


public class MethodAndConstructorReference {
	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
//		Runnable r = ()->{
//			for (int i = 0; i < 10; i++) {
//				System.out.println("Child Thread");
//			}
//		};
		MethodAndConstructorReference a1 = new MethodAndConstructorReference();
		Runnable r = a1::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i =0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
}

/*
   Lambda Expression ---> Method and Constructor reference
   
   classname::method name 
   object reference::met
   
   
 */
