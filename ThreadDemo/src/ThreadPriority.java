
public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		Runnable sinx = new Runnable() {
			@Override
			public void run() {
				System.out.println("Sinx :"+Math.sin(Math.PI/4));
			}
		};
		Runnable cosx = new Runnable() {
			@Override
			public void run() {
				System.out.println("Cosx :"+Math.cos(Math.PI/4));
			}
		};
		
		Thread t1 = new Thread(sinx);
		t1.setPriority(10);
		t1.setName("Thread sinx");
//		t1.sleep(2000);
		
		Thread t2 = new Thread(cosx);
		t2.setPriority(1);
		t2.setName("Thread cosx");
		
		t1.start();
		t2.start();

	}

}
