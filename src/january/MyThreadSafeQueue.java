package january;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MyThreadSafeQueue<T> {

	private List<T> list = new ArrayList();

	private final int limit = 10;

	public void enqueue(T element) {
		synchronized (list) {

			if (list.size() == limit) {
				try {
					throw new QueueFullException("Queue ist voll");
				} catch (QueueFullException e) {
					e.printStackTrace();
				}
			} else {

				list.add(element);
			}
		}

	}

	public T dequeue() {
		// So ist es wie im Supermarkt bei einer Warteschlange
		// T elem = list.get(0);
		// list.remove(0);
		synchronized (list) {
		if (list.size() > 0) {
			// Hier wird immer das letzte Element gelöscht.
			
				T elem = list.get(list.size() - 1);
				list.remove(list.size() - 1);
				return elem;
			} else {
			return null;
		}
	}

}
