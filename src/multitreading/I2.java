package multitreading;

public class I2 {

	public static void main(String[] args) {
		
		I1 t = new I1();
		t.start();
		t.interrupt();
		
		
		
			System.out.println("Main Thread executed");
		

	}

}
