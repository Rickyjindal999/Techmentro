package exceptionHandling_1;

public class Try3 {
	
	public static void main (String[] args)
	{
		try 
		{
			
			int a = 10/0;
			/*int a[] = new int[5];
			a[5]= 30/0;*/
		}catch (ArithmeticException e)
		{
			System.out.println("Task is completed");
		}
	}

}
