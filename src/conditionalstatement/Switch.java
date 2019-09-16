package conditionalstatement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter roll number");
		int rollno = sc.nextInt();
		
		switch(rollno) {
		case 100 :
			System.out.println("Sandeep");
		case 101 :
			System.out.println("Sahil");
			break;
			
		default	:
			System.out.println("NOT acceptable Number");
		}
		 

	}

}
