package exceptionHandling_1;

public class Try1 {

	public static void main(String[] args) {
		
		try {
			int x = 10/0;
		}catch (ArithmeticException ae)
		{
			System.out.println("Run catch block");
			System.out.println(ae);
		}

		finally
		{
			System.out.println("Bhai tu chle ga hi");
		}
	}

}
