import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("goo*");
		Matcher m = pattern.matcher("goo is good");
		while (m.find()) {
			System.out.println("Pattern found from " + m.start() + " to " + (m.end()-1));
		}
		
		String regex = "^(.+)@(.+)$";
		Pattern pattern2 = Pattern.compile(regex);
		Matcher m2 = pattern2.matcher("abc@bcd.com");
		System.out.println(m2.matches());
		
		
		String regex2 = "^[A-Za-z0-9+_-]+@(.+)$";
		Pattern pattern3 = Pattern.compile(regex2);
		Matcher m3 = pattern3.matcher("abc.dfg@bcd.com");
		System.out.println(m3.matches());
		
		
	}

}
