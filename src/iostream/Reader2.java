package iostream;

import java.io.*;

public class Reader2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fw = new FileReader("C:\\Users\\i B M\\Desktop\\JAVA\\abc.txt");
		BufferedReader br = new BufferedReader(fw);
		String line = br.readLine();
		while (line != null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		

	}

}
