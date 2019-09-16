package multitreading;

public class DaemonThread1 {

	public static void main(String[] args) {
		
		Daemon1 x = new Daemon1 ();
		x.setDaemon(true);
		x.start();
		System.out.println("End of main Thread");

	}

}
