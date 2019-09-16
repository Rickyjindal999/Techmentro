package exceptionHandling_1;

public class Test1TryCatch {
		
		public static void main (String[] arr)
		{
			System.out.println("ABC");
			try
			{
			System.out.println(10/0);
			}
			catch(ArithmeticException p)
			{
				System.out.println(10/2);
			}
			System.out.println("xyz");
		}
		
		
		
		
	}
