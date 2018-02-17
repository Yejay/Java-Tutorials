package january;

public class SimpleRunnable implements Runnable {

	@Override
	public void run() {
		while (!Thread.interrupted()) {

			System.out.println("I'm a simple Runnable");

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				System.out.println("Interrupted");
				// ohne diese zeile wird die schleife immer weiter laufen, weil das interrupted
				// flag wieder auf true gesetzt wird.
				Thread.currentThread().interrupt();
				e.printStackTrace();

			}
		}

		System.out.println("Interrupted");

	}

}
