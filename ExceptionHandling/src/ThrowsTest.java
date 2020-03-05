import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {

	public void method1() throws FileNotFoundException {
		method2();
		method3();
	}

	public void method2() {
		String str = "ss";
		if (str != null) {
			str.length();
		} else {
			throw new NullPointerException("String is Null");
		}
	}

	public void method3() throws FileNotFoundException {
		FileInputStream fi = new FileInputStream("E://abc.txt");
	}

	public static void main(String[] args) {
		ThrowsTest tt = new ThrowsTest();
		try {
			tt.method1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}
