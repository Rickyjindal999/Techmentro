package conditionalstatement;

import java.util.Scanner;

public class EvenOddFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int var = sc.nextInt();
		
		if(var%2 == 0)
		{
			System.out.println(var +": Is even");
		}
		else 
		{
			System.out.println(var + ": is odd");
		}
	}
	

}
