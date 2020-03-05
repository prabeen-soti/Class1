
public class CustomExceptionTest {
	
	public static void method2() throws CustomException {
		String str = null;
		if (str != null) {
			str.length();
		} else {
			throw new CustomException("String is Null");
		}
	}
	public static void main(String[] args) {
		try {
			method2();
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

}
