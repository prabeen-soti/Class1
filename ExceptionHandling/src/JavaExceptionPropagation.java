
public class JavaExceptionPropagation {
	public void method() {
//		try {
		method1();
//		} catch (ArithmeticException e) {
//			System.out.println("Exception Caught");
//		}
	}

	public void method1() {
		int a = 75 / 0;
	}

	public static void main(String[] args) {
		JavaExceptionPropagation jep = new JavaExceptionPropagation();
		try {
			jep.method();
		} catch (ArithmeticException e) {
			System.out.println("Exception Caught");
		}
		System.out.println("Method Called");
	}

}
