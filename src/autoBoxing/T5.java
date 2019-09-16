package autoBoxing;

public class T5 {
	
	public static void m1(Integer I)
	{
		System.out.println("Auto Boxing");
	}
	
	public static void m1(long l)
	{
		System.out.println("Wideing");
	}
	
	public static void main(String[] args) {
		
		int x = 10;
		m1(x);
		
		
		
	/*	public static void m1(lnt... x)
		{
			System.out.println("Var-Agrs"); -- Var agr method will get the chance when no other method will get a change(Least priority)
		}
		 public static void m1(Integer I)
		{
			System.out.println("Auto Boxing");
		}
		
		
		public static void main(String[] args) {
			
			int x = 10;
			m1(x);*/  // output -- AutoBoxing-- Autoboxing domenates var arg method . in genral var arg get least priorty 
		}

}
