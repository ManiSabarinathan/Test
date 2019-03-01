
public class ThreadTest {
	
	private static int count=0;
	
	public static synchronized void updateCount() {
		System.out.println(Thread.currentThread().getName());
		count++; 
	}
	
	public static void main(String ...strings ) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0;i<10;i++) {
					updateCount();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					updateCount();
				}
			}
		});
		
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(Thread.currentThread() + "Count value is :: "+count);
	}
}
