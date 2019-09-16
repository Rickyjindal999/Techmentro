package inheritance;

public class Overload1 {
	
	
	public void m1(int i)
	{
		System.out.println("The value of i is " + i);
	}

	public void m1(String s)
	{
		System.out.println("The value of s is" + s);
	}
	public static void main(String[] args) {
		
		
		Overload1 a = new Overload1();
		a.m1(5);
		Overload1 s = new Overload1();
		s.m1("sAHIL");
		
		
		

	}

}
