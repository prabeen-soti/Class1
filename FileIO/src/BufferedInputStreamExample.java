import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		
		try {
//			FileInputStream fin = new FileInputStream("E:\\abc.txt");
//			BufferedInputStream bin = new BufferedInputStream(fin);
			
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream("E:\\abc.txt"));
			
			StringBuilder str = new StringBuilder();
			
			int i=0;
			while((i=bin.read()) !=-1) {
				str.append((char)i);
			}
			
			bin.close();
			
//			fin.close();
			
			System.out.println(str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
