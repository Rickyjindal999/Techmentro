package multitreading;

public class T2 {

	public static void main(String[] args) {
		
		T1 t = new T1();
		t.setPriority(7);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("MainThread"+t.getPriority());
		}

	}

}
