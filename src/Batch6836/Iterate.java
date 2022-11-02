package Batch6836;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> tech=new LinkedList<String>();
		
		tech.add("C Programming");
		tech.add("C++");
		tech.add("Java for QA Engineers");
		Iterator<String> it=tech.iterator();
		
		System.out.println("The result is:"+it.next());
		
	    while(it.hasNext())
	    {
	    	String i=it.next();
	    	if(i.equalsIgnoreCase("c++"))
	    	{
	    		it.remove();
	    	}
	    }
	    System.out.println(tech);
		
	}

}
