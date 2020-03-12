import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInputStreamReader {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write any thing");
		try {
			String name = br.readLine();
			System.out.println("You Wrote: "+ name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
