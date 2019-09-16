package string1;

import java.lang.*;
public class StringB1 {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer ("Durga");
		StringBuffer s1 = new StringBuffer ("Durga");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));

	}

}
