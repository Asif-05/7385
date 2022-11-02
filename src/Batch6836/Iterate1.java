package Batch6836;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList <String> tech=new LinkedList<String>();
		
		tech.add("C Programming");
		tech.add("C++");
		tech.add("Java for QA Engineers");
	
		//tech.removeAll(tech);
		Iterator<String> it1=tech.iterator();
		
		System.out.println(it1.hasNext());
		System.out.println(it1.next());
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
