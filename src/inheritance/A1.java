package inheritance;

class A1 {
	
	
		public void display()
		{
			System.out.println("In a");
		}
		public static void invoke (A1 x)
		{
			x.display();// To specify the binding for the method call
		}
	

}
