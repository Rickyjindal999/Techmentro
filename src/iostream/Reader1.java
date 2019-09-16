package iostream;
import java.io.*;

public class Reader1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter ("C:\\Users\\i B M\\Desktop\\JAVA\\abc1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = {'a','b'};
		bw.write(ch);
		bw.newLine();
		bw.write("Sahil");
		bw.newLine();
		bw.write("hjdgsjas");
		//Thread.sleep(20000);
		bw.write("ewewewewwwwwwwwwwwwww");
		
		bw.flush();
		bw.close();
			
		
		
		

	

	
		
	}

}
