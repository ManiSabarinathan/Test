import java.util.ArrayList;
import java.util.List;

public class ContainsTest { 
    public static void main(String args[]) 
    { 
        // Creating an empty list 
        List<Integer> list = new ArrayList<Integer>(); 
  
        // Use add() method to add elements 
        // into the List 
        list.add(-1); 
        list.add(0); 
        list.add(1); 
              // Displaying the List 
        System.out.println("List: " + list); 
  
        // Creating another empty List 
        List<Integer> listTemp = new ArrayList<Integer>(); 
  
        listTemp.add(1); 
        listTemp.add(2); 
  
        System.out.println("Are all the contents equal? "
                           + list.containsAll(listTemp)); 
    } 
} 