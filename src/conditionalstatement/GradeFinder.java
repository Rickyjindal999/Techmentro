package conditionalstatement;

import java.util.Scanner;

public class GradeFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks");
		double var = sc.nextDouble();
		
		if (var <= 100 && var >= 90.01 )
		{
			System.out.println("A+ Is your grade");
		}
		else if(var <= 90 && var >= 80.01 )
		{
			System.out.println(" A Is your grade");
		}
		else if(var <= 80 && var >= 70.01 )
		{
			System.out.println(" B+ Is your grade");
		}

		else if(var <= 70 && var >= 60.01 )
		{
			System.out.println(" b Is your grade");
		}
		else if(var <= 60 && var >= 50.01 )
		{
			System.out.println(" c+ Is your grade");
		}
		else if(var <= 50 && var >= 40.01)
			System.out.println("C is your grade");
		else if (var <=40)
		{
			System.out.println("D is your grade");
		}
	}

}
