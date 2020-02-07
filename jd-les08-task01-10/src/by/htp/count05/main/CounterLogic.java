package by.htp.count05.main;

public class CounterLogic {

	public void decreaseCount(Counter counter) {
		int count = counter.getCount();

		while (count > counter.getMin()) {

			count--;

		}
		counter.setCount(count);
	}

	public void increaseCount(Counter counter) {
		int count = counter.getCount();

		while (count < counter.getMax()) {

			count++;

		}
		counter.setCount(count);
	}

	public int currentCount(Counter counter) {
		return counter.getCount();

	}

}
