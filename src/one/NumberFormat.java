package one;

public class NumberFormat {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		String s="123.45";
		int i=Integer.parseInt(s);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("It is a wrong number format:"+e.getMessage());
		}
      
	}

}
