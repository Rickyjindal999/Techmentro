package multitreading;

public class Test2 extends Thread {

	
	public void run()
	{
		System.out.println("No arg method");
	}
	
	public void run (int i)
	{
		System.out.println("Int arg method");
	}
	
	
}
