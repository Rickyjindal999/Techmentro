package innerclasses;

public class Test1 {

	
	int x = 10;
	static int y = 12;
	class inner
	{
		public void m1()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
}
