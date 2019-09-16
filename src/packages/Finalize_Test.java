package packages;

public class Finalize_Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Creating 3 objcets of A ....");
		FinalClass1 x = new FinalClass1();// it won't be destroyed 
		new FinalClass1();
		new FinalClass1();
		System.out.println("Requesting the intiation of Gagbage collector");
		System.gc();
		System.out.println("Suspending main() for 100 milisecod");
		Thread.sleep(100);// Execution is stopped for 100 mili second
		System.out.println("Main is reumed " +FinalClass1.counter+" objects are left" );
	}

}
