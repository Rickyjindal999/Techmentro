package iostream;
import java.io.*;

public class ReadWriteDelete {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\i B M\\Desktop\\JAVA\\4.txt");
		BufferedReader Br = new BufferedReader(new FileReader("C:\\Users\\i B M\\Desktop\\JAVA\\1.txt"));
		String line = Br.readLine();
		while (line != null)
		{
			boolean available = false;
			BufferedReader Br1 = new BufferedReader(new FileReader("C:\\Users\\i B M\\Desktop\\JAVA\\3.txt"));
			String target = Br1.readLine();
			while(target !=null)
			{
				if (line.equals(target));
				{
					available = true;
					break;
				}
			//	target = Br1.readLine();
			}
		if (available == false)
		{
			pw.print(line);
		}
		line = Br.readLine();
		}
		pw.flush();
		pw.close();

	}

}
