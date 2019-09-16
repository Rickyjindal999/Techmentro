package multitreading;

public class J2 {

	public static void main(String[] args) throws InterruptedException {
		J1.mt = Thread.currentThread();
		
		J1 t = new J1();
		t.start();
		//t.join(); Kind of deal lock situtation 
		
		for (int i =1;i<=10;i++)
		{
			System.out.println("Main Thread");
			try
			{
			Thread.sleep(1200);
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.println(J1.mt);

	}

}
