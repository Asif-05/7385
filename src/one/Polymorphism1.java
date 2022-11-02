package one;

public class Polymorphism1 {

	public String emp(String name)
	{
		System.out.println("The emp is:"+name);
		return name;
	}
	
	public void message()
	{
		System.out.println("Automation");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Polymorphism1 poly=new Polymorphism1();
	
		poly.emp("Rajesh");
	}

}
