import java.util.Iterator;

public class LinkedListTest {
		public static void main(String ... strings) {
			LinkedList1 list = new LinkedList1();
			list.add(30);
			list.add(26);
			list.add(10);
			System.out.println("==> "+ list);			
			
			list.show();
		}

}



class LinkedList1 {
	Node head;
	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.next=null;
		
		if(head == null) {
			//current node is the Head node
			head = node;
		}
		else {
			//Head node is not null which means there other nodes and head is referring to the other node
			//Traverse from the head node till node.next == null			
			
			//Step-1: create a temp node to traverse from head node
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;			
		}		
	}
	
	public void show() {
		//show the data from the head node;
		Node n = head;
		while(n.next != null) {
			System.out.println(n.data);
			//Move the node to the next node
			n = n.next;
		}
		System.out.println(n.data);
	}
}


class Node {
	int data;
	Node next;
}
