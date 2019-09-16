package iostream;
import java.io.*;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pr = new PrintWriter("C:\\Users\\i B M\\Desktop\\JAVA\\3.txt");
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\i B M\\Desktop\\JAVA\\1.txt"));
		String line = br.readLine();
		while (line != null)
		{
			pr.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("C:\\Users\\i B M\\Desktop\\JAVA\\2.txt"));
		line = br.readLine();
		while (line != null)
		{
			pr.println(line);
			line = br.readLine();
		}
		pr.flush();
		pr.close();
		
	}

}
