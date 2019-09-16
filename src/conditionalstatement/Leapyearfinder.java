package conditionalstatement;

import java.util.Scanner;

public class Leapyearfinder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an year");
		
		int var = sc.nextInt();
		
		if (var%4==0)
		{
			System.out.println(var + ": is leap year");
		}
		else 
		{
			System.out.println(var + ": is not a leap year");
		}

	}

}
