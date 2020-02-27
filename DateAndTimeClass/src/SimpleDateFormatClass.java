import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatClass {

	public static void main(String[] args) {
		
		SimpleDateFormat formmater = new SimpleDateFormat();
		
		
			
			Date date;
			try {
				formmater.applyPattern("dd/MM/yyy hh:mm:ss a z");
				date = formmater.parse("31/12/15 10:34:56 PM GMT-08:00");
				System.out.println(date);
				formmater.applyPattern("dd/MM/yyy");
				String dateStr = formmater.format(date);
				System.out.println(dateStr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
	}

}
