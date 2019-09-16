package exceptionHandling_1;

import java.util.Scanner;

public class Divide1 {
	static int a;
	static int b;
	static int c;
	

	public static void main(String[] args) {
		
		
		
		
		try 
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the number");
			a = sc.nextInt();
			Scanner sc1 = new Scanner (System.in);
			System.out.println("Enter another  number");
			b = sc1.nextInt();
			// first input converted back into int 
			
			int c = a/b;
			System.out.println("Result is :" + c);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
			System.out.println("Two number must be provided");
		}
		/*catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("Two number must be provided");
		}
		catch(NumberFormatException ae)
		{
			System.out.println(ae);
			System.out.println("Two number must be provided");
		}*/
	}

}
