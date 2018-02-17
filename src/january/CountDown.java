package january;

public class CountDown implements Runnable {

	private int limit;

	public CountDown(int limit) {
		this.limit = limit;
	}

	@Override
	public void run() {

		int i = 100;

		while (i >= limit) {
			System.out.println(i);
			i--;
		}

	}

}
