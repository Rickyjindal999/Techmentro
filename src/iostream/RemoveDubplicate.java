package iostream;

import java.io.*;

public class RemoveDubplicate {

	public static void main(String[] args) throws Exception{
	
		FileReader fr = new FileReader( "Hello1.txt");
		PrintWriter pw = new PrintWriter ("Hello3.txt");
		BufferedReader br = new BufferedReader(new FileReader("Hello1.txt"));
		String line = br.readLine();
		while (line != null)
		{
			boolean available = false ;
			BufferedReader br1 = new BufferedReader(new FileReader("Hellob.txt"));
			String target = br1.readLine();
			while (target != null)
			{
				if (line.equals(target))// check equality
				{
					available = true;
					break;
				}
				target = br1.readLine();
			}
			if (available == false)
			{
				pw.println(line);
				pw.flush();
			}
			line = br.readLine();
		}
		
		

	}

}
