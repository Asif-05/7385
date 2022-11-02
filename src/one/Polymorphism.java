package one;

public class Polymorphism {

	String num1="10";
	String num2="20";
	
	String res=num1+num2;
	
	static int i=10;
	static int j=20;
	
	static int tot=i+j;
	
	
	static public int methodoverloading(int a, int b)
	{
	    int c=a+b;
		System.out.println("The addition value is : "+ c);
		return c;
	}
	
	public int methodoverloading(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println("The addition value is : "+ d);
		return d;
	}
	
	public double methodoverloading(double x, double y)
	{
		double z=x+y;
		System.out.println("The addition value is:"+z);
		return z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism pol=new Polymorphism();
		
		pol.methodoverloading(5.3, 3.2);
		//pol.methodoverloading(6, 3);
		methodoverloading(6,3);
		
		pol.methodoverloading(6, 4, 2);
		
		
	
		System.out.println("The addition of two string values:"+pol.res);
		System.out.println("The addition of two integer values:"+tot);
		
		
	}

}
