package packages;

public class H {

	

	public static void main(String[] args) {
		
		
		Object o = new Object();
		
		System.out.println(o.getClass().getName());
		
		// Note :- For every loaded class JVM will create class class object in the heap area(JAVA.LANG.CLASS)
		// Program can use this class object to get class level information
		

	}

}
