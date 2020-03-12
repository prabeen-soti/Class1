import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferOutputStramExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("E:\\abc.txt");
			
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String str = "Java Developers in Nepal. BufferedOutput Stream";
			byte[] b = str.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			
			fout.close();
			System.out.println("Info added to file");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
