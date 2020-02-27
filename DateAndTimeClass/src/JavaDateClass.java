import java.util.Date;

public class JavaDateClass {
	
	public static void main(String[] args) {
		
		Date dateNow = new Date();
		
		System.out.println(dateNow);
		
		System.out.println(dateNow.toGMTString());
		
		Date dateNow2 = new Date();
		dateNow2.setYear(512);
		dateNow2.setMonth(13);
		System.out.println(dateNow2.toGMTString());
		
		Date dateNow3 = new Date(500, 10, 27, 5, 45, 10);
		System.out.println(dateNow3);
		System.out.println(dateNow3.toGMTString());
		
		System.out.println(dateNow3.after(new Date()));
		System.out.println(dateNow3.before(new Date()));
		
		System.out.println(dateNow2.compareTo(dateNow3));
		
		System.out.println(dateNow.getTime());
		
		Date newDate = new Date(1582815013676l);
		String date = newDate.toString();
		System.out.println(date);
		
		
		
		
	}

}
