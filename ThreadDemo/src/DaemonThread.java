
public class DaemonThread {
	static double sin45;
	static double cos45;
	
	public static void main(String[] args) throws InterruptedException {
		Runnable sinx = new Runnable() {
			@Override
			public void run() {
				sin45 = Math.sin(Math.PI/4);
			}
		};
		Runnable cosx = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				cos45 = Math.cos(Math.PI/4);
			}
		};
		
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1,sinx);
//		t1.setDaemon(true);
		t1.start();
		Thread t2 = new Thread(tg1,cosx);
		t2.start();
		System.out.println();
		t1.join();
		t2.join();
		System.out.println(cos45);
		System.exit(0);
		System.out.println(sin45);

	}

}
