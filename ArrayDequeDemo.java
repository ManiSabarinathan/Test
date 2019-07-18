import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
   public static void main(String[] args) {
      
      // create an empty array deque with an initial capacity
      Deque<Integer> deque = new ArrayDeque<Integer>(8);

      // use add() method to add elements in the deque
      deque.add(25);
      deque.add(30);
      deque.add(35);  //35->30->25

      // adding elements using push() method
      deque.push(10);
      deque.push(15); //15 ->10

      System.out.println("Printing Elements after using push operation:");
      for (Integer number : deque) {
         System.out.println("Number = " + number);
      }
   }
}