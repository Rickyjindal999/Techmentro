package dailyexercise;

public class ThisKeyword {
	
	public int x,y;
	
	public ThisKeyword(int x,int y)
	{
		this.x= x;
		this.y = y;
	}

	void display()
	{
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	
	public static void main(String[] args) {
		
		ThisKeyword a = new ThisKeyword (5,9);
		ThisKeyword b = new ThisKeyword (0,3);
		
		a.display();
		b.display();
		
		

	}

}
