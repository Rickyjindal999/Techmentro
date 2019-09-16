package exceptionHandling_1;

public class Divider {

	public static int Divider(int x,int y) throws ArrayIndexOutOfBoundsException
	{
		try {
			int z = x/y;
			System.out.println("Divide() is returnig the result");
			return z;
			}catch(Exception e)
		{
				System.out.println("Divide() is throwing Exception ");
		throw(e);
		}
		finally 
		{
			System.out.println("finally of divide() is executed");
		}	
	}
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
			try
			{
				//first input is converted back to int 
				int a = Integer.parseInt(args[0]);
				//2nd input is converted back to int
				int b = Integer.parseInt(args[1]);
				// division is performed
				int c = Divider(a,b);
				// result is displayed
				System.out.println("Result is :"+c);
			}
		catch (ArrayIndexOutOfBoundsException e)// Generalized exception handler
			{
			System.out.println("Following exception is caught in main:");
			System.out.println(e);// Description of the execution is printed 
			
			}

	}

}


