package multitreading;

public class Wait1 extends Thread {
	
	int total = 0;
	
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Child thread starts calculation");  // execute 2
		for(int i=1;i<=100;i++)
		{
			total = total + i;
		}
		System.out.println("Child Thread giving notification call");  // execute 3
	this.notify();
	}
	}
}
