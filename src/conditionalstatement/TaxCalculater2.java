package conditionalstatement;

import java.util.Scanner;

public class TaxCalculater2 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		double var1=sc.nextDouble();
		System.out.println("Enter your income");
		int c = 25000;
		int d = 100000;
		
	
		
		if (var1<=250000)
		{
			System.out.println("Nil Income Tax");
		}
		else if (var1 >= 250000.01 && var1 <= 500000)
		{
			double b =  var1 - 250000;
			System.out.println("More than 2.5 lacs to 5 lacs @ 10 "+ b*10/100 );
		}
		else if (var1 >= 500000.01 && var1 <= 1000000)
		{
			double e =  var1 - 500000;
			System.out.println("More than 5 lacs to 10 lacs @ 10 "+ e*20/100+c);
		}
		
		else if (var1 >= 1000000.01)
		{
			double e =  var1 - 1000000;
			System.out.println("More than 10 lacs "+ e*30/10+d+c );
		}
			
		
	}

}
