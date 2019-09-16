package conditionalstatement;

import java.util.Scanner;

public class FareCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance covered");
		int var = sc.nextInt();
		
		int a = 50;
		int b = 180;
		int c;
		int d;
		int e = 230;
		int f;
		int g;
	
		;
		if(var<= 5)
		{
			System.out.println( a + ": Fare is 50 rs");
		}
		else if (var <= 20)
		{
			f = var-5;
			c = a+ (f*12);
			System.out.println(c);
		} 
		else
		{
			g = var-20;
			d =  e + (g*14);
			System.out.println(d);
			
		}
		}
}
