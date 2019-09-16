package multitreading;

public class TestWait  {

	public static void main(String[] args) throws InterruptedException {
		
		Wait1 w = new Wait1();
		w.start();
		
		synchronized(w)
		{
			
		System.out.println("Main Thread callin wait method"); // execute 1
		w.wait();
		System.out.println("Main thread call notification"); // execute 4
		System.out.println(w.total); // execute 5
		}
	}

}
