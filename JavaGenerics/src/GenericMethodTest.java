
public class GenericMethodTest {
	
	public static <AB, E, A, C > A printArray(AB[] inputArray, E a) {
		C c = (C) new String("Hello");
		for(int i =0 ; i<inputArray.length;i++) {
			System.out.print(" "+inputArray[i]);
		}
		System.out.println();
		return (A) a;
	}
	
	public static <E extends Number> void add(E a, E b) {
		System.out.println(a.getClass().getName());
		if(a.getClass().getName().equals("java.lang.Integer")) {
			Integer i = a.intValue();
			System.out.println(i);
		}
		Float f = a.floatValue()+b.floatValue();
		System.out.println(f);
	}

	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4};
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		Integer a = printArray(intArray,2);
		System.out.println(a);
		printArray(doubleArray,4);
		printArray(charArray,6);
		add(9, 6);

	}

}
