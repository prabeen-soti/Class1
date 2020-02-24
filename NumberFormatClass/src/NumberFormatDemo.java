import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		double d =123456.789;
		System.out.println(d);
		NumberFormat nfItaly = NumberFormat.getInstance(Locale.ITALY);
		System.out.println(nfItaly.format(d));
		NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
		System.out.println(nfUs.format(d));
//		Locale [] local = NumberFormat.getAvailableLocales();
//		for(int i =0;i<local.length;i++) {
//			System.out.println(local[i].getDisplayCountry());
//		}
		
		NumberFormat nfIndia = NumberFormat.getInstance(Locale.forLanguageTag("hi"));
		System.out.println(nfIndia.format(d));
		
        Locale indiaLocale = new Locale("in", "IN");
        NumberFormat india  = NumberFormat.getInstance(indiaLocale);
        System.out.println(india.format(d));
	}

}
