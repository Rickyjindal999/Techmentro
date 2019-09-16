package serialization1;

import java.io.*;

public class Account implements Externalizable {
	
	String  s;
	int i;
	int j;
	
	public Account()
	{
		System.out.println("Public no Args");
	}
	
	Account(String  s,int i,int j)
	{
		this.s= s;
		this.i= i;
		this.j= j;
	}
	
	
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);		
	}
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		s = (String)in.readObject();
		i = in.readInt();
	}

	public static void main (String[] arr) throws Exception
	{
	
	Account t = new Account("Sahil", 10, 20);
	FileOutputStream fos = new FileOutputStream("C:\\Users\\i B M\\Desktop\\JAVA\\4.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(t);
	
	FileInputStream fis = new FileInputStream("C:\\Users\\i B M\\Desktop\\JAVA\\4.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Account  t1= (Account)ois.readObject();
	System.out.println(t1.s+".........."+ t1.i+"..........."+t.j);
	}
}