package packages;

public class Student {

	String name ;
	int roll_no;
	Student(String name,int roll_no)
	{
		this.name = name;
		this.roll_no = roll_no;
	}
	
	public static void main (String arr[])
	{
		Student s1 = new Student ("Sahil 1", 101);
		Student s2 = new Student ("Sahil 2", 102);
		Student s3 = new Student ("Sahil 3", 103);
		Student s4 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
				
	}
}
