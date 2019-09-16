package innerclasses;

public class A {
	
	static class inner {
		
		public void m1(int x)
		{
			System.out.println("Inner class:" +x);
		}
		
		public static void main(String arr[])
		{
			inner n = new inner();// we don't need to create outer class object in case of static inner class2
			n.m1(3);
		}
		 
	 }
	
	
	
	

}
