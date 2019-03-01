import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
//blocking queue allows elements to be accessed in FIFO.


public class ProducerConsumerBlockingQueueTest {
	
	public static void main(String ...strings) { 
		BlockingQueue queue = new LinkedBlockingQueue<String>();
		Thread t1 = new Thread(new Producer(queue));
		t1.start();
		
		Thread t2 = new Thread(new Consumer(queue));
		t2.start();
		
	}
}


class Producer implements Runnable {
	BlockingQueue que;
	Producer(BlockingQueue que) {
		this.que = que;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				que.put(i);
				System.out.println("Producing element :: "+ i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	BlockingQueue quue;
	public Consumer(BlockingQueue quue) {
		this.quue = quue;
	}
	@Override	
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				quue.take();
				System.out.println("Consuming element :: "+ i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}