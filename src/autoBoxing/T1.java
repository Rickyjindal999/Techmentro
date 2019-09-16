package autoBoxing;

public class T1 {

	static Integer I = 10;  // autoboxing 
	
	public static void m1(Integer k)
	{
		
		int m = k;
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		

		int i = I; // Autounboxing 
		m1(i);
		
		
		
	}

}
