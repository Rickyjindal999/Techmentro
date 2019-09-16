package multitreading;

public class Daemon extends Thread {

	public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		Daemon t = new Daemon ();
		boolean x = t.isDaemon();
		System.out.println(x);
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}

}
