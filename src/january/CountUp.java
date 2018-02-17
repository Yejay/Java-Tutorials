package january;

public class CountUp extends Thread {

	private int limit;

	public CountUp(int limit) {
		this.limit = limit;
	}

	@Override
	public void run() {

		int i = 0;

		while (i <= limit) {
			System.out.println(i);
			i++;
		}

	}

}
