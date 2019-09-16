package inheritance;

public class Constractor2 extends Constractor1{

	int b;
	
	public Constractor2(int a,int y)
	{
		super(a);
		b = y;
		System.out.println("The value of b is" + b);
	}
	public static void main(String[] args) {
	
		Constractor2 obj = new Constractor2(200,400);
		

	}

}
