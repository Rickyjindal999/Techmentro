package serialization1;

import java.io.*;

public class Data1 {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\i B M\\Desktop\\1.txt");
		boolean h = f.exists();
		System.out.println(h);
		f.createNewFile();
		f.exists();
		System.out.println(h);
		
		PrintWriter w = new PrintWriter (f);
		Thread.sleep(1);
		w.write("Helllo kjhdkjahkdhkas");
		w.flush();
		w.close();
		
		

	}

}
   