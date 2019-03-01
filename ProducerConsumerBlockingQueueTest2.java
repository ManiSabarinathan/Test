import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueueTest2 {
	
	public static void main(String ...strings ) {
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(); 
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(3000);
						 System.out.println("Produced Element:: "+i);
						 queue.put(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					try {
						System.out.println("Consumed Element:: "+queue.take());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();
		t2.start();		
		
	}

}


