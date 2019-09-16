package exceptionHandling_1;

public class try2 {

	
	public static int retInt() {
	int a= 100;
	{
		
		try {
			return a;
		} catch(ArithmeticException e)
		{
			System.out.println("catch called");
			System.out.println(e);
			return a;
		}
		finally
		{
			 a = 5500;
			System.out.println("finally called");
			return a;
		}
		}
	}
	public static void main(String[] args) {
		
		System.out.println(retInt());
	}

}
