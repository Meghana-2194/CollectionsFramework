package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList(); // Non - Generic
		ArrayList<String> s1 = new ArrayList<String>(); // Generic

		arr.add(15); // --->0 th index
		arr.add("HELLO"); // --->1 index
		arr.add('C'); // --->2 index
		arr.add(67); // --->3 index
		arr.add(90); // --->4 index

		s1.add("Java");
		s1.add("Oops");
		s1.add("Selenium");

		System.out.println("Size of the arrayList:  " + arr.size()); // print
																		// the
																		// size
																		// or
																		// lenght
																		// of
																		// the
																		// arraylist

		System.out.println("The value at 3rd index  " + arr.get(3)); // to get
																		// the
																		// value
																		// of
																		// specific
																		// index
																		// use
																		// get

		// Print all the values using for loop

		for (int i = 0; i < arr.size(); i++) {
			System.out.println("The value of all the arrayList is : " + arr.get(i));
		}

		//// Print all the values using for loop for String

		for (int j = 0; j < s1.size(); j++) {
			System.out.println("The value of all the arrayList is : " + s1.get(j));
		}

		System.out.println("----Using iterator----");
		// Using Iterator to print all the value
		Iterator it = arr.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----Using iterator for s1----");
		
		Iterator it1 = s1.iterator();

		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
