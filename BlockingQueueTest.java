import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//FIFO
public class BlockingQueueTest {
	public static void main(String ...strings ) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
		try {
			queue.put("Sabari");
			queue.put("nathan");
			queue.put("Juju");
			queue.put("Papu");			
			queue.take();
			queue.take(); 
			
			System.out.println(queue);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
