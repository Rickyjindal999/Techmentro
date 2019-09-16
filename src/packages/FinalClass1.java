package packages;

public class FinalClass1 {
	
	// data member to uniquely identify an object 
	private int no;
	// data member to count object of the class
	
	static int counter;
	public FinalClass1()
	{
		no = ++ counter;
		System.out.println("object " + no + " a is created");
	}
	// finalize method is overridean to given object to this class
	// a chnace to do something before destruction . it will be invoked by the garbage collector
	
	protected void finalize ()
	{
		counter--;
		System.out.println("object " + no + "of a is bieng destroyed");
	}

}
