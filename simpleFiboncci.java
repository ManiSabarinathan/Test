import java.util.HashMap;

public class simpleFiboncci {
	HashMap<Integer,Integer> map = new HashMap<>();
	{		
		map.put(0, 0);
		map.put(1,1);
		map.put(2,1);
	}
	public static void main(String ...strings ) {
		simpleFiboncci ob = new simpleFiboncci();
		System.out.println(ob.fib(8));
		System.out.println(ob.fibCompute(8));
	}
	
	public int fib(int n) {
		if(map.containsKey(n)) {
			return map.get(n);
		}
		else {
			//do the computation
			//f(n) = f(n-1)+f(n-2)
			int value = fib(n-1)+fib(n-2);
			map.put(n, value);
			return value;
		}
	}
	
	
	public int fibCompute(int n) {
		//do computation if Absent
		return map.computeIfAbsent(n, k-> fibCompute(n-1)+fibCompute(n-2));		
	}
}
