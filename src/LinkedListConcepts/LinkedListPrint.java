package LinkedListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrint {

	public static void main(String[] args) {
		
		LinkedList<String>  a = new LinkedList<String>();
		
		a.add("Hello");
		a.add("Java");
		a.add("c++");
		a.add("Python");
		a.add("Selenium");
		
		System.out.println(a) ;
		
		System.out.println("------1. For loop------") ;
		
		//1. For loop 
		for (int i = 0 ; i < a.size() ; i ++){
			System.out.println(a.get(i)) ;
		}
		
		
		System.out.println("------2.Advanced For Loop ------") ;
		//2. Advanced for Loop 
		for (String st : a){
			System.out.println(st) ;
		}
		
		
		System.out.println("------3.Iterator ------") ;
		//3. Iterator 
		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()) ;
		}
		
		
		System.out.println("------4.While Loop ------") ;
		//4.While 
		
		int n = 0 ;
		while (a.size() > n){
		System.out.println(a.get(n));
		n++;
		}
		
	}

}
