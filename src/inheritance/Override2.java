package inheritance;

public class Override2 extends Override1{
	
	void m2()
	{
		System.out.println("9Tara");
	}

	public static void main(String[] args) {
		
		Override1 b = new Override1();
		b.m1();
		
		Override1 c = new Override1();
		c.m2();
		
		Override1 a = new Override2();
		a.m2();
		


	}

}
