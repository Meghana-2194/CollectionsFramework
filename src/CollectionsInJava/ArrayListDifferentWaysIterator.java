package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDifferentWaysIterator {

	public static void main(String[] args) {

		ArrayList<String> fruit = new ArrayList<String>();

		fruit.add("Mango");
		fruit.add("Apple");
		fruit.add("Grapes");

		// 1. Using for each loop and Lambda Expression( ->)
		
		System.out.println("===========Using for each loop and Lambda expression===========");
		
		//Element : any string value can be used 

		fruit.forEach(list -> { // sweet : element , which refers to fruit obj
			System.out.println(list);
		});
		
		// 2. Using Iterator
		
		System.out.println("===========Using Iterator===========");
		
		Iterator<String>   it = fruit.iterator();
		while(it.hasNext()){
			String list1 = it.next();
			System.out.println(list1);
		}
		
		//3. 	Using iterator and forEachRemaining() method
		System.out.println("===========Using iterator and forEachRemaining() method==========");
		
		it = fruit.iterator();
		it.forEachRemaining(list2->{
			System.out.println(list2);
		});
		
		//4. Using simple for loop
		System.out.println("===========Using simple for each loop==========");
		for(String list3 : fruit){
			System.out.println(list3);
		}
		
		//5. Using simple for loop with order/index
		System.out.println("===========Using simple for each loop with order/index ==========");
		
		for (int i = 0 ; i < fruit.size() ; i ++){
			System.out.println(fruit.get(i));
		}
		
		//6.using listIterator() method to traverse in both direction 
		
		ListIterator<String> fruitIterator = fruit.listIterator(fruit.size());
		while ( fruitIterator.hasPrevious()){
			String list6 = fruitIterator.previous();
			System.out.println(list6);
		}
		
	}

}
