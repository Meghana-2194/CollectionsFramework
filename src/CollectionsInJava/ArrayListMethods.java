package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		
		ArrayList<String> arr1 = new ArrayList<String> ();
		
		arr1.add("Java");
		arr1.add("C++");
		arr1.add("C");
		
	    ArrayList<String> arr2 = new ArrayList<String>();
		
		arr2.add("C++");
		arr2.add("Selenium");
		arr2.add("java");
		
		// addAll()
		arr1.addAll(arr2);  // all the values of arr2 will be stored in arr1
		
		//removeAll()
		/*arr1.removeAll(arr2);*/
		
		//retainAll()  : checks the common part 
		/*arr1.retainAll(arr2) ;   
		System.out.println(arr1); // prints the common
		System.out.println(arr2); // prints the same as it is */
		
		Iterator<String> it = arr1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()) ;
		}

	}

}
