package multitreading;

public class Test1 {

	public static void main(String[] args) {
	
		
		TestTrread t = new TestTrread();  // Thread instantiation 
		t.start();// starting of thread 
		for (int i = 0 ; i <10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
