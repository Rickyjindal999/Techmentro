package serialization1;
import java.io.*;

public class Dog extends Animal
{
	int j = 20;
	
	public static void main(String[] args) throws Exception
	{
		Dog d = new Dog();
		System.out.println(d.i+"........."+d.j);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\i B M\\Desktop\\JAVA\\xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\i B M\\Desktop\\JAVA\\xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
		System.out.println(d1.i+"............"+d1.j);
		
	}
	
	
	

}
