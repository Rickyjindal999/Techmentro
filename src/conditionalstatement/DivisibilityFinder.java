package conditionalstatement;

import java.util.Scanner;

public class DivisibilityFinder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int var = sc.nextInt();
		
		System.out.println("Enter the divisor");
		int var1 = sc.nextInt();

		if (var%var1 == 0)
		{
			System.out.println(var + ": is divisible by :" + var1);
		}
		else 
		{
			System.out.println(var + ": is not divisible by :" + var1);
		}
	}

}
