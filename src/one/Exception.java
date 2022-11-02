package one;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 int[] marks={90,80,93};
		 
		// int i=10.5f;
		 
		// System.out.println("THe integer value is:"+i);
		 
	     /**int i=20;
		 try
		 {
			 System.out.println("The division value is:"+i/0);	 
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("The exception name is:"+e.getMessage());
			 System.out.println("Anything divided by zero leads leads to infinity please avoid it..!!");
			 System.out.println("Rather than dividing by zero please divide by 2 or anyother number :"+i/2);
		 }
		 **/
		 
		
		try
		{
			 System.out.println("The third value is:"+marks[5]);	 
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The execption is"+e.getMessage());
		    System.out.println("Access value lesser than or equal to 2: "+marks[2]); 	
		}
		 
			 
	}

}
