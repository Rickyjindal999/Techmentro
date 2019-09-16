package multitreading;

public class Daemon1 extends Thread {
	
	public void run()
	{
		for (int i = 1;i<=10;i++)
		{
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
					
				e.printStackTrace();
			}
		}
	}

}
