package inheritance;

public class Country {
	
	// owned entity class

	private String name,capital;
	private HeadOfState hos;
	
	
	public Country (String n,String c,HeadOfState h)
	{
		name = n;
		capital = c;
		hos = h; 
	}
	
	public void display()
	{
		System.out.println("Name :" + name);
		System.out.println("Capital :" + capital);
		System.out.println("Head of State");
		hos.display();
	
	}
}
