package multitreading;

public class T12 extends Thread {

	public static void main(String[] args) {
		
		T12 t = new T12();
		System.out.println("Main Thread"+t.getName());
		
		t.setName("Void");
		System.out.println("After chaning thread name" + t.getName());
		t.setPriority(3);
		
		for (int i = 1;i<=5;i++)
		{
			System.out.println("Main Thread "+ t.getPriority());
			
		}
		T11 t1 = new T11();
		t1.setName("Child thrread");
		System.out.println("Name"+t1.getName());
		
		t1.setPriority(7);
		System.out.println("After changing the priority"+ t.getPriority());
		
		
		t1.run();
		
	}

}
