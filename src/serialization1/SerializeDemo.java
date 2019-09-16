package serialization1;

import java.io.*;

public class SerializeDemo  {

	public static void main(String[] args) throws Exception {
		
		Dog d = new Dog ();
		FileOutputStream out = new FileOutputStream("C:\\Users\\i B M\\Desktop\\JAVA\\abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(d);
		
		
		FileInputStream in = new FileInputStream("C:\\Users\\i B M\\Desktop\\JAVA\\abc.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		Dog d1 = (Dog)ois.readObject();
		System.out.println(d1.i+"............"+d1.j);
		
	}

}
