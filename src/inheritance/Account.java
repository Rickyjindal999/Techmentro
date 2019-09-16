package inheritance;

abstract class Account {

	private String name;
	private double balance;
	
	public Account(String n, double b)
	{
		name = n ;
		balance = b;
	}
	/*Method to display the details of accounts 
	 * in the following format
	 * 
	 * Name :- Account Name 
	 * Type :- Account Type
	 * Balacne :- Account Balance
	 * Interset Rate :- Rate of interest 
	 * This format must be same for all
	 * types of accounts
	 */
	public final void display ()
	{
		System.out.println("Name :" + name);
		System.out.println("Type :" + this.getClass().getName()); // Gift approach
		
		System.out.println("Balance :" + balance);
		System.out.println("Interset Rate :" + this.getInterestRate()); // force apprach 
		
	}
	
	public abstract double getInterestRate();
}
