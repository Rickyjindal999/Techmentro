package dailyexercise;

public class A {

	int a ;
	
	public A()
	{
		System.out.println("In default constructor");
		a = 10;
		
	}
	
	{
		System.out.println("Hello");
	}
	
	public A(int b){
		System.out.println("in parameterized constructor");
		
		a = b;
	}
	
	
	
	void display () {
		System.out.println("Value of a " + a);
	}
	
	public static void main(String[] args) {
		
		A x = new A ();
		x.display();
		A x1 = new A(20);
		x1.display();
		
		
	}

}
