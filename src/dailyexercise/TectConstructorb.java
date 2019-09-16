package dailyexercise;

public class TectConstructorb extends TectConstructor{
	
	
	int roll;
	int marks;

	TectConstructorb(int x, String y,int roll,int marks) {
		super(x, y);
		this.roll = roll;
		this.marks = marks;
	}

	
void display ()
{
	System.out.println(x+y+roll+marks);
}
	public static void main(String[] args) {
		
		TectConstructorb A = new TectConstructorb (1,"Sahil",10,100);
		A.display();
		
		

	}

}
