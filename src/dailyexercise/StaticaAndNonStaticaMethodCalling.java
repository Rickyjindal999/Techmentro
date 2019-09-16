package dailyexercise;

public class StaticaAndNonStaticaMethodCalling {

	
		static int a = 10;
		static String name = "Test";
		
		
		public static void display()
		{
			System.out.println(a);
			System.out.println(name);
		}
		
		void function()
		{
			display();
		}
		
	public static void main(String[] args) {
	
		StaticaAndNonStaticaMethodCalling A = new StaticaAndNonStaticaMethodCalling ();
		A.function();
		
		display();
		
	}

}
