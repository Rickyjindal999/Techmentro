package multitreading;

public class Priority extends Thread  {
	
	
	public void run()
	{
		
	}

	
	public static void main (String[] arr)
	{
		Thread t = new Thread();
		Thread t1 = new Thread();
		t.setPriority(7);
		t1.setPriority(8);
		t.start();
		t1.start();
		System.out.println(t1.getPriority());
		System.out.println(Thread.currentThread());
		
		
	}
}
