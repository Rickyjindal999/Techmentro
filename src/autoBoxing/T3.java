package autoBoxing;

public class T3 {

	public static void main(String[] args) {

		Integer x = 10;
		Integer y = x;
		x++;
		System.out.println(x); // o/p 11
		System.out.println(y); // o/p 10
		System.out.println(x==y); // for every wrapper class when a new value will be introduce a new object will be created.
	}

}
