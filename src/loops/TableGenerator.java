package loops;

import java.util.Scanner;

public class TableGenerator {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The No.:");
		int var1 = sc.nextInt();
		
		/*for (int i = 1;i<=10;i++)
		{
			int var2 = var1 * i;
			System.out.println(var1 + "*" + i + "=" + var2  );
		}*/
		
		int i = 1;
		while (i<=10)
		{
			int var2 = var1 * i;
			System.out.println(var1 + "*" + i + "=" + var2 );
			i++;
		}

	}

}
