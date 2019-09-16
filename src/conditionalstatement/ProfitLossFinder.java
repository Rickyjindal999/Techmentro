package conditionalstatement;
import java.util.Scanner;

public class ProfitLossFinder {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter cost price");
		int var = sc.nextInt();
		
		System.out.println("Enter Selling Price");
		int var1 = sc.nextInt();
		int var3=var1-var;
		int var4=var-var1;
		
		
	
		if (var<var1)
		{
			
			System.out.println("Profit is made :" +var3 );
		}
		else 
		{
			System.out.println("Loss is incurred :" + var4);
		}
	}

}
