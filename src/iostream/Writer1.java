package iostream;
import java.io.*;
public class Writer1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter f = new FileWriter("C:\\Users\\i B M\\Desktop\\JAVA\\abc.txt",true);
		 f.write(100);
		 f.write("\n");
		 f.write("urgs\nSoteware ");
		 char[] ch = {'a','b','c'};
		 f.write(ch);
		 f.write("\n");
		 f.flush();
		 f.close();
	}

}
