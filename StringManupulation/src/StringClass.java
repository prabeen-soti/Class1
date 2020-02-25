
public class StringClass {

	public static void main(String[] args) {
		char [] ch = {'j','a','v','a'};
		
		String sh = new String(ch);
		
		String sh1 = new String("java1");
		
		String sh2 = "Java1";
		
		System.out.println(sh1.charAt(4));
		
		System.out.println(sh1.length());
		
		System.out.println(sh1.substring(2));
		
		System.out.println(sh1.substring(0, 2));
		
		System.out.println(sh1.contains("av"));
		
		System.out.println(sh1.equals(sh2));
		
		System.out.println(sh1.equalsIgnoreCase(sh2));
//		sh1 = "";
		System.out.println(sh1.isEmpty());
		
		
		String java = " Java ";
		String language = " is a programming language";
		
		String concat = java.concat(language);
		
		System.out.println(concat);
		
		System.out.println(java.trim());
		
		String concat1 = java.trim().concat(language);
		
		System.out.println(concat1);
		
		String replace =  java.replace('a', 'e');
		
		System.out.println(java);
		
		System.out.println(replace);
		
		System.out.println(java.replace("av", " "));
		
		System.out.println(java.indexOf('a'));
		
		System.out.println(java.indexOf("av"));
		
		System.out.println(java.indexOf('a',3));
		
		System.out.println(java.indexOf("a",3));
		
		System.out.println(java.toLowerCase());
		
		System.out.println(java.toUpperCase());

		String greeting = "Hello World!";
		System.out.println(greeting.substring(0,5));
		System.out.println(greeting.substring(6,12));
		String greeting1 = "Hello World!";
		
		System.out.println(greeting.hashCode());
		System.out.println(greeting1.hashCode());

		
//		if(greeting == greeting1) {
//			System.out.println("Is Called");
//		}
		
		if(greeting.equals(greeting1)) {
			System.out.println("Is Called");
		}
		
		String checkNull = null;
//		checkNull.isEmpty();
		if(checkNull != null && !checkNull.isEmpty()) {
			System.out.println("Is Not Null and Empty");
		}
		
		String abc = "CDE";
		String bcd = "ABC";
		System.out.println(abc.compareTo(bcd));
		
	}

}
