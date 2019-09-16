package dailyexercise;

public class Test1 {

	public static void main(String[] args) {
		cuboid c1 = new cuboid(5,6,7);
		cuboid c2 = new cuboid(8);
		System.out.println("Dimension of cubiod C1");
		c1.display();
		System.out.println("Dimension of cubiod C2");
		c2.display();
		System.out.println("Volume of c1 :" + c1.volume());
		System.out.println("Volume of c2  :" + c2.volume());

	}

}
