import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProdConsumerTest {
	 
	public static void main(String ...strings ) throws InterruptedException {
		List<String> list = new ArrayList<>();
		
		PCClass pc = new PCClass();
		 
		Thread t1 = new Thread(new Runnable() {			
			@Override
			public void run() {
					pc.produce(list);				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {			
			@Override
			public void run() {
					pc.consume(list);				
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}

class PCClass {
	
	public void produce(List<String> list) {
		synchronized(this) {
			System.out.println("Populating elements...");
			list.add("Juju");
			list.add("Papu");
			list.add("sabari");
			System.out.println("Added Enough elements, going to sleep now...");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Ack notification, going to populate another list of elements ");
			
		}
	}
	
	public void consume(List<String> list) {
		synchronized(this) {
			System.out.println("About to consume the message from List");
			Iterator it = list.iterator();
			while(it.hasNext()) {
				System.out.println("==> " + it.next());
			}
			notify();			
		}
	}
}
