package loops;

import java.util.Scanner;

public class DigiSumFinder {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to find the sum of digits");
		int no = sc.nextInt();
		int temp = no;
		int rem, sum =0;
		
		
		while (temp != 0)
		{
			rem = temp % 10;
			
			temp = temp /10;
			sum = sum + rem;
		}
		
		System.out.println("The of digits is :" + sum);
		
		
		
		
		
	}

}
