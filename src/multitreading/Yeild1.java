package multitreading;

public class Yeild1 extends Thread{
	
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("Child");
		Thread.yield();
		/*try {
			Thread.sleep(1990);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		}
	}
}
