package MapConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeHashMap {
	
	String name ;
	int age ;
	String role;
	
	public EmployeeHashMap(String name , int age , String role){
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public static void main(String[] args) {
		
		HashMap<Integer , EmployeeHashMap> emp = new HashMap<Integer , EmployeeHashMap>();
		
		EmployeeHashMap e1 = new EmployeeHashMap("Java" , 56 , "QA");
		EmployeeHashMap e2 = new EmployeeHashMap("Selenium" , 55 , "DEV");
		
		emp.put(1, e1);
		emp.put(5, e2);
		
		//Print all the values 
		
		for (Entry<Integer,EmployeeHashMap> m : emp.entrySet()){
			int k = m.getKey();
			EmployeeHashMap e = m.getValue();
			
			System.out.println("The key is: "  +k);
			System.out.println("The values are : "  +e.name+ "  "+e.age+"  "+e.role);
		}

	}

}
