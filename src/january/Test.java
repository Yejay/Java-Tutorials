package january;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		CountUp t1 = new CountUp(100);
		
		Thread t2 = new Thread(new CountDown(0));
		
		t1.start();
		
		t1.join();
		
		t2.start();
		
		t2.join();
		
		System.out.println("Ende");
		
		// Thread t1 = new Thread(new SimpleRunnable());
		//
		// t1.start();
		//
		// Thread.sleep(3000);
		//
		// t1.join();
		//
		// Thread.sleep(100);
		//
		// t1.interrupt();
		
		// Thread.currentThread().isInterrupted(); // ist Instanzmethode, setzt das Flag nicht um.
		// Thread.interrupted(); // ist Klassenmethode, setzt das Flag um.
	}

}
