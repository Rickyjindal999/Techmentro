package multitreading;

public class Join1 extends Thread {

	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println("Child Thread");
			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				//e.printStackTrace();
				System.out.println(e);
			}*/
		}
	}
}
