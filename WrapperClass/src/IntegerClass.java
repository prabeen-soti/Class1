
public class IntegerClass {
	
	public static void main(String[] args) {
		int x = 25;
		Integer x1 = 45;
		Integer y = new Integer(3);
		Integer z = new Integer("33");
		Integer a1 = new Integer("2");
		
		System.out.println(x);
		System.out.println(y.toString());
		System.out.println(z);
		String data = Integer.toString(9);
		
		Integer a = 4;
		
		float c = y;
		
		double d = a.doubleValue();
		int b = Integer.parseInt("2");
		String binary = "0b"+Integer.toBinaryString(a);
		System.out.println(binary);
		
		double d1 = Double.parseDouble("23.45");
		System.out.println(d1);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
