package packages;

import java.lang.reflect.Method;

public class Student1 {
	
	// Get class () method - To return run time class definition of an object 
	// We can use getClass() to get run time class definition on an object
	
	
	
	public static void main (String arr[]) {
	int count = 0;
	Object o = new String ("Druga");
	Class c = o.getClass();
	System.out.println("Fully Qualified name of class"+ c.getName());
	Method[] m = c.getDeclaredMethods();
	System.out.println("Method infomation");
	for (Method m1 : m)
	{
		count++;
		System.out.println(m1.getName());
	}
	System.out.println("The number of method " + count);
	}
}