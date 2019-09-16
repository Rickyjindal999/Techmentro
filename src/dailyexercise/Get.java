package dailyexercise;

public class Get {

	private int age;
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	public static void main(String[] args) {
	
		Get g = new Get();
		g.setName("Sahil");
		System.out.println(g.getName());
		

	}

}
