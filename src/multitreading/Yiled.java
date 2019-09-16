package multitreading;

public class Yiled {

	public static void main(String[] args) {
		Yiled r = new  Yiled ();
		
		
		
		Yeild1 t = new Yeild1();
		t.currentThread().getName();
		t.start();
		
		
		for (int i = 1;i<=10;i++)
		{
			System.out.println("Main Thread");
			try {
			Thread.sleep(120);
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}

	}

}
