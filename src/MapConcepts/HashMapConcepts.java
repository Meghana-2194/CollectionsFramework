package MapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

	public static void main(String[] args) {
		
		HashMap<Integer,String>  hm = new HashMap<Integer,String>();
		
		hm.put(1, "Java");
		hm.put(2, "C++");
		hm.put(3, "Selenium");
		hm.put(4, "Appium");
		hm.put(null, null);
		
		System.out.println("Values are : "  +hm);
		
		System.out.println("Values are : "  +hm.get(4));
		
		hm.remove(2);
		
		System.out.println("Values after removing : "  +hm);
		
		if (hm.containsKey(8)) {
			System.out.println("Values is present");
		}else {
			System.out.println("The Value is not present");
		}
		
		hm.putAll(hm);
		
		// To print all the values using for loop
		for ( Map.Entry<Integer, String>  m1 : hm.entrySet()){
			
			System.out.println(m1.getKey()+"   "+m1.getValue());
		}
		

	}

}
