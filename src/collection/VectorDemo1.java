package collection;
import java.util.*;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println(v.capacity());
		for (int i =1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement('a');
		System.out.println(v.capacity());
		System.out.println(v);
	}

}
