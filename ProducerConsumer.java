import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
	
	
	public static void main(String ...strings ) {
		PCPTask obj = new PCPTask();
		 
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0;i<10;i++) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				obj.produce();
				}
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0;i<10;i++ ) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				obj.consume();
				}
			}
		});
		t1.start();
		t2.start();
		
	}
}

class PCPTask  {
	Random random = new Random();
	int intValue;
	boolean isProduced=false;
	
	public synchronized void produce() {
		System.out.println("==> " + Thread.currentThread());
		if(isProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		intValue = random.nextInt(20);
		isProduced=true;
		System.out.println("Produced Value ::: "+ intValue);
		notify();
		
	}
	
	public synchronized void consume() {
		
		if(!(isProduced)) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consuming value :: "+intValue);
		isProduced=false;
		notify();
	}
}