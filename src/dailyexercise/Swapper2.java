package dailyexercise;

public class Swapper2 {

	
	public static void main (String arr[])
	{
		Swapper1 a = new Swapper1 (5);
		Swapper1 b = new Swapper1 (6);
		
		System.out.println(a.value);
		System.out.println(b.value);
		
		
		Swapper3.swap(a, b);
		
		System.out.println(a.value);
		System.out.println(b.value);
		
		
		
	}
}
