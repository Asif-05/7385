package one;

public class MethodOverriding extends Polymorphism1{


	public String emp(String name)
	{
		System.out.println("The emp is:"+name);
		return name;
	}
	
	public void message()
	{
		System.out.println("Selenium");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding m=new MethodOverriding();
		
		m.emp("Ramesh");
		m.message();
		
	    
		
	}

}
