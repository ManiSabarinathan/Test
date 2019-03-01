import java.util.*;    

class TestArrayLinked{    
 public static void main(String args[]){    
  //LinkedHashMap 
	 //LinkedHashMap offers 0(1) lookup and insertion. 
	 //In LinkedHashMap, Keys are ordered by their insertion order.
  Map m1=new HashMap();   
  m1.put(10,100);  
  m1.put(30,300); 
  m1.put(50,500); 
  m1.put(40,400); 
  m1.put(20,200); 
  
  Map m2=new LinkedHashMap<>();   
  m2.put(10,100); 
  m2.put(30,300); 
  m2.put(50,500); 
  m2.put(40,400); 
  m2.put(20,200); 
 
    
  System.out.println("Map: "+m1);  
  System.out.println("linkedlist: "+m2);  
 }    
}    
