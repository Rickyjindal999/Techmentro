package collection;
import java.util.*;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push("a");
		s.push("b");
		s.push("c");
		System.out.println(s);
		System.out.println(s.search("a"));
		
		System.out.println(s.search("z"));

	}

}
