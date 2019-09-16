 package dailyexercise;

public class cuboid {

	private int l,b,h;
	
	public cuboid (int x,int y,int z)
	{
		l = x;
		b = y;
		h = z;
	}


	public cuboid (int x)
	{
		l = x;
		b = x;
		h = x;
	}
	
	public void display()
	{
		if (l==b && b==h)
		{
			System.out.println("cube");
		}
		else 
		{
			System.out.println("Lenght" + l);
			System.out.println("Lenght" + b);
			System.out.println("Lenght" + h);
		}
	}
	public int volume ()
	{
		return l*b*h;
	}
	
}