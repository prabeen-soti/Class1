import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		StringTokenizer tokens = new StringTokenizer("Java Class,2",",");
		System.out.println(tokens.countTokens());
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		
		String st = "Java Class,2";
		String [] str = st.split(",");
//		String [] str = "Java Class".split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
