
public class StringBuilderClass {

	public static void main(String[] args) {
		
		StringBuilder stbuf = new StringBuilder();
		
		StringBuilder stbuf1 = new StringBuilder("Java iss a programming language");
		
		StringBuilder strbuf2 = new StringBuilder(5);
		
		System.out.println(stbuf);
		System.out.println(stbuf1);
		System.out.println(strbuf2);
		
		strbuf2.append("JAVA is a language");
		
		System.out.println(strbuf2);
		
		stbuf1.append("!");
		System.out.println(stbuf1);
		
		stbuf1.insert(5, "is");
		System.out.println(stbuf1);
		
		stbuf1.replace(5, 10, "is");
		System.out.println(stbuf1);
		
		strbuf2.delete(8, 10);
		System.out.println(strbuf2);
		
		strbuf2.reverse();
		System.out.println(strbuf2);
		
		System.out.println(stbuf.capacity());

		stbuf.ensureCapacity(20);
		
		
		stbuf.append("java");
		
		System.out.println(stbuf.capacity());
		
		System.out.println(strbuf2.capacity());
		
		System.out.println(stbuf.charAt(2));
		
		System.out.println(stbuf1);

		stbuf1.substring(0,4);
		
		System.out.println(stbuf1);
		System.out.println(stbuf1.substring(0,4));
		

	}

}
