package loops;

import java.util.Scanner;

public class OddNumberSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int var1 = sc.nextInt();
		
	/*	int j= 0;
		
		for (int i = 1;i<=var1;i++ )
		{
		
			if (i % 2 != 0) 
			{
				
				j += i;
			}
			System.out.println(j);
		}*/
		
		
		int i = 1;
		int j = 0;
		while (i<=var1)
		{
			if (i%2 != 0)
			{
				j += i;
			}i++;
			System.out.println("Sum of odd numbers : " +j);
		}
				
		
	}

}
