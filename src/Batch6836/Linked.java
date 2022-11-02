package Batch6836;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> tech=new LinkedList<String>();
		
		tech.add("C Programming");
		tech.add("C++");
		tech.add("Java for QA Engineers");
		tech.addFirst("Technologies");
	    tech.add(4, "Selenium");
	    tech.addLast("WebDriver");
	    tech.removeLast();
	    tech.removeFirst();
	
		tech.getFirst();
		
       System.out.println("LinkedList is:"+tech);
       System.out.println("The last value is: "+tech.getLast());
       System.out.println("The first value is :"+tech.getFirst());
       
     /**  for(String i:tech)
       {
    	   System.out.println("The final linked List is:"+i);
       }
      **/
       
       
	}

}
