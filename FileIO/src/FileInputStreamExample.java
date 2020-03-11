import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			
			FileInputStream fi = new FileInputStream("E:\\abc.txt");
//			byte[] b = new byte[30];
//			while(fi.read(b)!=-1);
//			fi.close();
//			String str = new String(b);
//			System.out.println(str);
			
			StringBuilder str = new StringBuilder();
			int i=0;
			while((i=fi.read()) !=-1) {
				str.append((char)i);
			}
			System.out.println(str);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
