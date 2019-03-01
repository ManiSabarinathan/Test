import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
   public static void main(String args[]) {
      //String a[] = { "A", "E", "I" };
      //String b[] = { "O", "U" };
      
      int a[] = {4,3,10,44,9,77,86}; 
      int b[] = {5,6,82,77,33};

      System.out.println("Array-A :: "+ Arrays.toString(a));
      System.out.println("Array-B :: "+ Arrays.toString(b));
      
      List list = new ArrayList(Arrays.asList(a));
      list.addAll(Arrays.asList(b));
      System.out.println("Size of the List "+ list.size());
      Iterator it = list.iterator();
   
      while(it.hasNext()) {
    	  int aa[] = (int[])it.next();
    	  System.out.print(Arrays.toString(aa));
      }
  
      System.out.println("Next option: ");
      int c[] = new int[a.length+b.length];
      System.arraycopy(a, 0, c, 0, a.length);
      System.arraycopy(b, 0, c, a.length, b.length);
      
      System.out.println(Arrays.toString(c));
      
      
      //int [] combined = ArrayUtils.addAll(a, b);
   }
}