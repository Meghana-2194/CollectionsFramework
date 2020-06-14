package MapConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer , String> h1  = new Hashtable<Integer , String>();
		
		h1.put(1, "tom");
		h1.put(2, "Java");
		h1.put(3, "Selenium");
		 
		//Create a clone copy
		Hashtable<Integer , String> h2  = new Hashtable<Integer , String>();
		
		h2 = (Hashtable)h1.clone(); // TOP-CASTING
		
		System.out.println("Before cloning"  +h1);
		System.out.println("After cloning"  +h2);
		
		//Clear or Delete the values .
		h2.clear();
		System.out.println( h1);
		System.out.println( h2); // remains same 
		
		// Contains Value method  : return type : boolean
		if(h1.contains("Java")){
			System.out.println( "true");
		}else {
			System.out.println( "false");
		}
		
		//1.print all the values using Enumeration concepts 
		
		Enumeration<String> e =h1.elements();
		
		System.out.println("----Printing all the values using Enumeration-----");
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		
		System.out.println("----Printing all the values using  EntrySet-----");
		// print all the values using entry set 
		
		Set s = h1.entrySet();
		System.out.println(s);
		
		//Check both the hashtables are equal or not 
		
		if(h1.equals(h2)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		//get the specific value
		System.out.println("Get the value of 3rd key :  "  +h1.get(3));
		
		//Get the HashCode of HashTable
		System.out.println("HashCode of the HashTable :  "  +h1.hashCode());
		
	}

}
