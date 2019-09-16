package inheritance;

public class Bank {

	public static void main(String[] args) {
		
		System.out.println("Opennig three accounts");
	
		Account a1 = new Saving ("Ravi",12000);
		Account a2 = new RD ("Vipul",1000);
		Account a3 = new Fd ("Rishab",20000);
		
		System.out.println("Details of first account");
		a1.display();
		System.out.println("Details of second account");
		a2.display();
		System.out.println("Details of first account");
		a3.display();
	}

}
