package dailyexercise;

public class StaticBlockExp {

	static int num;
	static String name ;
	
	static {
		
		num = 1 ;
		name = "Sahil";
	}
	
	public static void main(String[] args) {
	System.out.println(num);
	System.out.println(name);

	}

}
