import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptions {

	public static void main(String[] args) {
		int a = 50;
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
//		 int c1 = a/b;
		//single try catch
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException exception) {
			System.out.println("Input must be no zero number");
		}

		try {
			FileInputStream fi = new FileInputStream("E://abc.txt");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("File does not exist");
		}

		// Multiple catch of exception

		try {

			int c = a / b;
			System.out.println(c);
			String str = null;
			str.length();
//			FileInputStream fi = new FileInputStream("E://abc.txt");

		} catch (ArithmeticException exception) {

			System.out.println("Input must be no zero number");

		} catch (NullPointerException e) {
			System.out.println("Null pointer Exception");
		}

		// Nested try catch
		try {

			int c = a / b;
			System.out.println(c);
			try {
				String str = null;
				str.length();
			} catch (NullPointerException e) {
				System.out.println("Null pointer Exception new");
			}

		} catch (ArithmeticException e) {
			System.out.println("Input must be no zero number new");
			try {
				String str = null;
				str.length();
			} catch (NullPointerException e1) {
				System.out.println("Null pointer Exception new 2");
			}
		}
		
		//finally keyword
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Input a int value");
			int val = sc.nextInt(); // Exception if you put String value
			System.out.println(val);
		} catch(InputMismatchException e) {
			System.out.println("Class cast exception callled");
		}finally {
			sc.close();
			System.out.println("Scanner close");
		}

	}

}
