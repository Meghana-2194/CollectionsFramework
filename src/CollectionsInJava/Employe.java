package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Employe {
	
	String name ;
	int age ; 
	String dept;
	 
	public Employe(String mName, int mAge , String mDept){
		name = mName ;
		age  = mAge;
		dept  = mDept ;
	}

	public static void main(String[] args) {
		
		Employe e1 = new Employe("Tom" , 23 , "QA") ; 
		Employe e2 = new Employe("Megh" , 25 , "dev") ; 
		Employe e3 = new Employe("Shravs" , 24 , "devops") ; 
		
		ArrayList<Employe> ar= new ArrayList<Employe>();
		
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		// Print all the employee list
		
		Iterator<Employe> it = ar.iterator();
		
		while(it.hasNext()){
			Employe emp = it.next();
			System.out.println(emp.name+"  "+emp.age+ " " +emp.dept);
		}
		
		
	}

}
