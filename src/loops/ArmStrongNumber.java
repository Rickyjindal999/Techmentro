package loops;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int no  = sc.nextInt();

		
		int temp = no;
		int rem , sum = 0;
		
		while (temp != 0)
			
		{
			rem = temp % 10;
			temp = temp /10;
			sum = sum + rem*rem*rem;
		}
		
		if (no == sum)
		{
			System.out.println(sum +" number is arm strong number");
		}
		else 
		{
			System.out.println("Number is not an arm strong number");
		}
	}

}
