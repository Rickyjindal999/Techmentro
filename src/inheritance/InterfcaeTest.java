package inheritance;

public class InterfcaeTest {

	public static void main(String[] args) {
		
		Integer a = new Integer (5);
		Integer b = new Integer (6);
		System.out.println("Values and sum of the intergers");
		Adder.display(a, b);
		Complex c1 = new Complex (2,3);
		Complex c2 = new Complex (4,5);
		System.out.println("Values and sum of the complex number");
		Adder.display(c1, c2);
	}

}
