
public class ProConsumerTest {
	
	public static void main(String ...strings ) throws InterruptedException { 
		PC pc = new PC();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				pc.producer();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				pc.consumer();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
	}
}


class PC {
		public void producer() {
			synchronized(this) {
				System.out.println("Produceing the message...");
				try {
					wait();
					
					System.out.println("Received notification, Proceeding with the next action...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				
			}
		}
		
		
		public void consumer() {
			try {
				Thread.sleep(1000);
				synchronized(this) {
					System.out.println("Consumer Thread in Action...");
					notify();
					System.out.println("About to complete consumer task...");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
}
