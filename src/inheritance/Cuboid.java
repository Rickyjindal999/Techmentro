package inheritance;

public class Cuboid extends Comman {

	int h;
	public Cuboid(int x, int y,int z) {
		super(x, y);
		h = z;
		}
	
	
 public void display()
 
 {
	 super.display();
	 System.out.println("The value of h :" + h);
 }
 
 public int volume()
 {
	 return l*b*h;
 }
 

}
