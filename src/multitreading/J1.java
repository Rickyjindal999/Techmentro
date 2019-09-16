package multitreading;

public class J1 extends Thread {
	
	static Thread mt;
	
	public void run()
	{
		try 
		{
			mt.join();
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		for (int i =1;i<=10;i++)
		{
			System.out.println("Child Thread");
		}
	}

}
