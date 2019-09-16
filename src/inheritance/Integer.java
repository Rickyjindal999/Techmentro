package inheritance;

class Integer implements Number {
	
	private int value ;
	public Integer (int x)
	{
		value = x;
	}
	
	public void display()
	{
		System.out.println(value);
	}
	public Number add (Number n)
	{
		Integer i = (Integer)n;
		int x = this.value + i.value;
		return (Number) new Integer(x);
	}
	
	
}
