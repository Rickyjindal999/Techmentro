package inheritance;

public class InhertianceTest {

	public static void main(String[] args) {
		
		
		Cuboid newarea1 = new Cuboid (10,20,30);
		newarea1.display();
		System.out.println(newarea1.volume());
		
		Rectnagular newarea = new Rectnagular(5,3);
		System.out.println(newarea.area());
		System.out.println(newarea.perimeter());
		}
}
