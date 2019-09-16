package dailyexercise;

public class MultiStaticExp {

	static int a;
	static String name;
	
	static
	{
		 System.out.println("Static Block 1");
		a = 10;
		name = "Sahil";
	}
	
	static 
	
	{
		
		 System.out.println("Static Block 2");
		a = 11;
		name = "Kunal";
	}
	
	public static void main(String[] args) {
		
System.out.println(a);
System.out.println(name);
		
		
	}

}
