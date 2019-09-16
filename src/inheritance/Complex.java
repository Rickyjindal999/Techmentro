package inheritance;

class Complex implements Number {

	
	private int r, i;
	
	public Complex (int x,int y)
	
	{
		r=x;
		i=y;		
	}
	
	public void display()
	{
		System.out.println(r + "+" + i + "i");
	}
	
	public Number add (Number n)
	
	{
		Complex c = (Complex)n;
		int r = this.r + c.r;
		int i = this.i + c.i;
		return new Complex (r,i);
	}
}
