package inheritance;


// sub class of account
  class Saving extends Account {

	public Saving(String n, double b) {
		super(n, b);
		}	
	public double getInterestRate()
	
	{
		return 3.5;
	}
	
	

}
