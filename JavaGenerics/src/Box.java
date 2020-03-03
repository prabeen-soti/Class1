
public class Box <T , D> {
	
	private T t;
	private D d;
	
	public void add(T t,D d) {
		this.t=t;
		System.out.println(this.t.getClass().getName());
		System.out.println(d.getClass().getName());
	}
	
	public T get() {
		return t;
	}

	public static void main(String[] args) {
		Box<Integer,String> box = new Box<Integer,String>();
		box.add(10,"Hello");
		
		Box<String,Integer> box1 = new Box<String,Integer>();
		box1.add("Hello", 24);
	}

}
