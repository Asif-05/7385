package Batch6836;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> products=new HashMap<String, String>();
		
		products.put("Mobile", "S123");
		products.put("Laptops","L456");
		products.put("Printer", "G678");
		
		for(String i:products.keySet())
		{
			System.out.println("The key is:"+i+" "+"The values is:"+products.get(i));
		}
		
		for(String j:products.values())
		{
			System.out.println("The value is:"+j );
		}
		
		HashMap<String, Integer> marks=new HashMap<String, Integer>();
		
		marks.put("Maths", 98);
		marks.put("physics", 92);
		marks.put("chemistry",90);
		
		for(String k:marks.keySet())
		{
			System.out.println("The Key is:"+k+" "+marks.get(k));
		}
		System.out.println("The Needed input is:"+marks.get("Maths"));
		System.out.println("The size is:"+marks.size());
		System.out.println("This keys is removed:"+marks.remove("physics"));
		System.out.println("The final result is"+marks);
	}

}
