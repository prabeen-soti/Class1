
public class ThreadClass extends Thread {
	
	@Override
	public void run() {
		try {
			sleep(20000);
			System.out.println("Thread run1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException{
		String str ="";
		ThreadClass t = new ThreadClass();
		t.setName("ThreadClass");
		t.start();
		System.out.println("Thread main" + t.getName());
	}

}
