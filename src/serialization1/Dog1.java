package serialization1;

import java.io.Serializable;
import java.io.*;

public class Dog1 extends Animal1 implements Serializable  {
	
	int j = 20;

	public static void main(String[] args) {
		
		Dog1 d = new Dog1();
		d.i = 888;
		d.j = 999;
		
		

	}

}
