package multitreading;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Join1 t = new Join1();
		t.start();
		// t.join();
		 
		 for (int i=10;i>1;i--)
		 {
			 System.out.println(i);
		 }

	}

}
