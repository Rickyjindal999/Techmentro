package multitreading;

public class I1 extends Thread{
	
	public void run()
	{
		try {
			for (int i = 1;i<10;i++)
			{
				System.out.println("I am lazy friend");
				Thread.sleep(1200);
			}
				
			}catch(InterruptedException e)
			{
				System.out.println("I got interrupted");
			}
		
	}
}

