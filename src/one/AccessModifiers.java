package one;

public class AccessModifiers {
	
	private int val=10;
	
	char section='A';
	
	protected float avg=72.2f;
			
	public String code="B6836";

	private void welcome()
	{
		System.out.println("Welcome to Automation Testing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers am=new AccessModifiers();
		
	//	System.out.println("The value is:"+am.i);
		System.out.println("The code is:"+am.code);
		am.welcome();
	}

}
