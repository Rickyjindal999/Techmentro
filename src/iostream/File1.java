package iostream;
import java.io.*;
public class File1 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\i B M\\Desktop\\JAVA\\abc.txt");
		File f2 = new File("C:\\Users\\i B M\\Desktop\\JAVA\\abc1.txt");
		boolean f1 = f.exists();
		System.out.println(f1);
		f.createNewFile();
		f2.createNewFile();
		System.out.println(f);
	}

}

