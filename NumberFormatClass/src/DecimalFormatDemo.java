import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalFormatDemo {

	public static void main(String[] args) {
//		String pattern = "000.00";
//		DecimalFormat decimalFormat = new DecimalFormat(pattern);
//		
//		String format = decimalFormat.format(9.1);
//		System.out.println(format);
		
		Locale locale = new Locale("en", "UK");
		
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator(';');
		symbols.setGroupingSeparator(':');
		
		String pattern = "#,##0.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
		decimalFormat.setGroupingSize(3);
		String number = decimalFormat.format(123456789.123);
		System.out.println(number);
		
	}

}
