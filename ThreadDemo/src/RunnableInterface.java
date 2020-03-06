
public class RunnableInterface implements Runnable {

	public static void main(String[] args) {
		RunnableInterface runable = new RunnableInterface();
		Thread t = new Thread(runable);
		t.start();
		System.out.println("Thread main");
	}

	@Override
	public void run() {
		System.out.println("Thread run1");
	}

}
