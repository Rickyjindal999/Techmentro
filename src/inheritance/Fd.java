package inheritance;

//sub class of account
class Fd extends Account{

	public Fd(String n, double b) {
		super(n, b);
		
	}
	public double getInterestRate()
	
	{
		return 7.5;
	}
	
	
	
}
