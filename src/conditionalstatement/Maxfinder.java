package conditionalstatement;

import java.util.Scanner;

public class Maxfinder {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		
		System.out.println("Enter First Number");
		
		int var1 = s.nextInt();
		
		System.out.println("Enter 2nd Number");
		
		int var2 = s.nextInt();
		
		if (var2>var1) {
			
			System.out.println(var2 + ": is the max number");
		}
		else {
			System.out.println(var1+ ": is the max number");
		}
		
	}

}
