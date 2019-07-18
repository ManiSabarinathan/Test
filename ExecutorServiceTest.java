import java.io.PrintStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {
	
	public static void main(String ...strings ) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		/*Future<String> future = service.submit(new Callable<String>() {
			public String call() throws Exception {
				return "Juju from call method in Callable interface";
			}
		});*/
		
		/*Future future = service.submit(new Runnable() {
			public void run() {
				System.out.println("Juju from call method in Callable interface");
			}
		});
				
		System.out.println(future.get());
		service.shutdown();*/
		
		//Collection of Callable
		Set<Callable<String>> callableSet = new HashSet<>();
		callableSet.add(new Callable<String>() { 
			public String call() {
				return "call1";
			}
		});
		callableSet.add(new Callable<String>() { 
			public String call() {
				return "call2";
			}
		});
		
		List<Future<String>> futureList = service.invokeAll(callableSet);
		for(Future<String> future: futureList) {
			System.out.println(future.get());
		}
		
		service.shutdown();
		
		
	}
	
	
	
}
