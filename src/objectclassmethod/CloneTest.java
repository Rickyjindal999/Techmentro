package objectclassmethod;

public class CloneTest implements Cloneable {
	
	int x = 167;
	int y = 8;

	public static void main(String[] args) throws CloneNotSupportedException
	
	{
		
		CloneTest t = new CloneTest();
		CloneTest t2 = (CloneTest) t.clone();
		
		t2.x= 555;
		t.y=89;
		
		System.out.println(t2.x);
		
		
	}

}
