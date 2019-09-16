package conditionalstatement;

import java.util.Scanner;

public class Whoisyounger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of first person");
		 int var = sc.nextInt();
		 
		 System.out.println("Enter the age of second person");
		 int var1 = sc.nextInt();
		 
		 System.out.println("Enter the age of second person");
		 int var2 = sc.nextInt();
		 
		 if (var>var1 && var1<var2)
		 {
			 System.out.println(var1 + ": is yourger");
		 }
		 else if (var1>var && var<var2)
		 {
			 System.out.println(var + ": is yourger");
		 }
		 else if (var1>var2 && var2<var)
		 {
			 System.out.println(var2 + ": is yourger");
		 }
	}

}
