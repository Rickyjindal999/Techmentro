package autoBoxing;

public class T4 {

	public static void main(String[] args) {
		Integer x =10; // eg -------------- 1
		Integer y = 10; // 
		System.out.println(x==y);
		
		Integer x1 = new Integer(10); // Egf:------------
		Integer x2 = new Integer(10);
		System.out.println(x1==x2);
		
		Integer x3 = new Integer(10); // Egf:------------
		Integer x4 = 10;
		System.out.println(x3==x4);
		
		Integer x5 = 100; // eg //------
		Integer x6 = 100;
		System.out.println(x5==x6);
		
		
		

	}

}
