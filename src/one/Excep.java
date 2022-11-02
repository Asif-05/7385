package one;

import java.util.ArrayList;

public class Excep {

//	static int[] mark={90,80,78};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> mark=new ArrayList();
		
		mark.add(96);
		mark.add(88);
		mark.add(78);
		mark.add(72);
		mark.add(91);
		
try
   {
		mark.get(5);
		
	}
catch(IndexOutOfBoundsException e)
{
System.out.println("The exception is: "+e);
	
	mark.add(86);
}

	for(int i:mark)
	{
		System.out.println("The mark is: "+i);
	}
}
}
