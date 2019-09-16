package iostream;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException
	{
		
		
		File f = new File ("C:\\Users\\i B M\\Desktop\\Hello1.txt");
		
		
		if (f.createNewFile())
		{
			System.out.println("FIle is created");
		}
		else 
		{
			System.out.println("File already exist");
		}
		
		FileWriter Wr = new FileWriter(f);
		Wr.write("Hello Jeet");
		Wr.close();
		
	}
}
