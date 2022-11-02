package one;

public class PassingParameters {
	
	public String info()
	{
		String name="Rajesh";
		System.out.println("The Employee is:"+ name);
		return name;
	}

	public void total(int tot)
	{
		System.out.println("The total is :"+ tot);
	}
	
	
	
	public int add(int a, int b)
	{
			
		int c=a+b;
		
		System.out.println("The addition value is:"+ c);
		return c;
		
	}
	
	public int sub()
	{
		int a=9;
		int b=4;
		
		int c=a-b;
		System.out.println("The Subtraction values is:"+c);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassingParameters pass=new PassingParameters();
		
		//pass.info("Rajesh");
		
		pass.add(5, 5);
		pass.add(6, 6);
		pass.add(7, 7);
		pass.sub();
		pass.total(400);
		
		
	}

}
