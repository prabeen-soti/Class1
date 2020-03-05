
public class ThrowTest {

	public void method1() {
		try {
			int a = 75 / 0;
		} catch (ArithmeticException e) {
//			throw e;
			throw new ArithmeticException("Could not divided by zero");
		}
	}

	public static void validateNumber(int no) {
		if (no <= 18) {
			throw new ArithmeticException("Number must be grater than 18");
		} else {
			System.out.println("The number is " + no);
		}
	}

	public static void main(String[] args) {
		ThrowTest tt = new ThrowTest();
		try {
			tt.method1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			validateNumber(19);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
	}

}
