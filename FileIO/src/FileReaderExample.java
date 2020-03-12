import java.io.FileReader;
import java.nio.CharBuffer;

public class FileReaderExample {

	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("E:\\abc.txt");
		
		StringBuilder str = new StringBuilder();
		int i=0;
		while((i=fr.read()) !=-1) {
			str.append((char)i);
		}
		System.out.println(str);
		} catch (Exception e) {
		}
	}

}
