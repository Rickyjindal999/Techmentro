package conditionalstatement;

import java.util.Scanner;

public class Casefinder {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the alphbate");
		char var= a.next().charAt(0);

		if (var >=65 && var <=90)
		{
			System.out.println(var + ": upper case");	
		}
		else if (var >= 97 && var <= 120)
		{
			System.out.println(var + ": lower case");
		}
		else 
		{
			System.out.println(var + ": Fuck oFF");
		}
	}

}
