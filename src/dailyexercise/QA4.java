package dailyexercise;

public class QA4 {

	static 
	{
		System.out.println("D is loaded");
	}
	
	public static void main(String[] args) {
	
		System.out.println("Creating object of A");
		
		QA1 n = new QA1 ();
		
		System.out.println("Invoking display ()of b ....");
		
		QA2.display();
		
		System.out.println("Value of c is : " + QA3.value);
		System.out.println("Creating another class ofobject A__");

		QA1 y = new QA1();
	
	}

}
