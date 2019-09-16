package dailyexercise;

public class StaticBlockExp4 {

	static int num;
	String name;
	
	public static void main(String[] args) {
	
		StaticBlockExp4 a = new StaticBlockExp4 ();
		StaticBlockExp4 b = new StaticBlockExp4 ();
		
		a.num=12;
		a.name="Sahil";
		
		b.num= 13;
		b.name= "Rishabh";
		
		System.out.println(a.num);
		System.out.println(a.name);
		
		System.out.println(b.num);
		System.out.println(b.name);
		
		
		

	}

}
