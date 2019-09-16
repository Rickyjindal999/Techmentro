package iostream;
import java.io.*;

public class Printer1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter out = new PrintWriter("C:\\Users\\i B M\\Desktop\\JAVA\\abc.txt");
		out.write(100);
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("Sahil Gupta");
		out.flush();
		out.close();
	}

}

