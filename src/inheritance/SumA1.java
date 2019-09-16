package inheritance;

public class SumA1 extends A1 {
	
	public void display()
	{
		System.out.println("In B");
	}
  
	
}
	class BindingTest
	{
		public static void main(String[] args)
		{
			A1 obj = new A1();
			SumA1 obj1 = new SumA1();
			A1.invoke(obj);
			A1.invoke(obj1);
					
		}
	
	}
	
