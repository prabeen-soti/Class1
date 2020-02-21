import java.math.BigInteger;

public class BigIntegerClass {

	public static void main(String[] args) {
		long factorial=1;
		for(int i=1;i<=100;i++) {
			factorial*=i;
		}
		System.out.println(factorial);
		
		BigInteger factorial1= new BigInteger("1");
		for(int i=1;i<=100;i++) {
			factorial1 = factorial1.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorial1);

		BigInteger power = BigInteger.valueOf(4);
		BigInteger value = power.pow(2);
		System.out.println(value);
	}

}
