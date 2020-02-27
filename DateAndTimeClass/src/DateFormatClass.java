import java.text.DateFormat;
import java.util.Date;

public class DateFormatClass {

	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println("Default Date: " +currentDate);
		
		String dateToStr = DateFormat.getDateInstance().format(currentDate);
		System.out.println(dateToStr);
		
		dateToStr = DateFormat.getDateInstance(DateFormat.FULL).format(currentDate);
		System.out.println(dateToStr);
		
		dateToStr = DateFormat.getTimeInstance().format(currentDate);
		System.out.println(dateToStr);
		
		dateToStr = DateFormat.getDateTimeInstance().format(currentDate);
		System.out.println(dateToStr);
		
	}

}
