package LinkedListConcepts;

import java.util.LinkedList;

public class LinkedListInJava {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<String>();
		
		//add
		ll.add("Java");
		ll.add("C++");
		
		//print 
		System.out.println("Values are : "  +ll);
		
		//addFirst
		ll.addFirst("Oops");
		//addLast
		ll.addLast("Python");
		System.out.println("Values are : "  +ll);
		
		//get
		System.out.println(ll.get(3));
		
		//set  : replace and addd 
		ll.set(0, "Selenium");
		System.out.println(ll);
		
		//removeFirst and removeLast
		ll.removeFirst();
		ll.removeLast() ;
		System.out.println(ll);
		
		//remove 
		ll.remove(0);
		System.out.println(ll);

	}

}
