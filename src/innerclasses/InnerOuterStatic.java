package innerclasses;

public class InnerOuterStatic {

	
	static class inner
	{
		public static void main(String arr[])
		{
			System.out.println("Static nested class main method");
		}
	}
	public static void main(String arr[])
	{
		System.out.println("outer class main method");
	}
	
	
}
