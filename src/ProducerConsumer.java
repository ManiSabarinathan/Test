import java.util.Random;

public class ProducerConsumer {

	public static void main(String ...strings ) {
		PCTask task = new PCTask();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0;i<10;i++ ) {
					task.produce();	
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0;i<10;i++ ) {
					task.consume();		
					try {
						Thread.sleep(1000);
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


class PCTask {
	Random random = new Random();
	boolean isProduced=false;
	int intValue;
	
	public synchronized void produce() {
		if(isProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//Produce the data and notify the other Thread(Consumer)
		intValue = random.nextInt(20);
		isProduced=true;
		System.out.println("Produced data: "+ intValue);
		notify();	
	}
	
	
	public synchronized void consume() {
		if (!(isProduced)) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//Consume the data and notify the Producer thread
		System.out.println("Consumed data: "+ intValue);
		isProduced = false;
		notify();
	}
}