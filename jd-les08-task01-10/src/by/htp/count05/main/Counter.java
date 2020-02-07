package by.htp.count05.main;

public class Counter {

	private int count;
	private int min;
	private int max;

	public Counter() {
		count = 0;
		min = 0;
		max = 70;
	}

	public Counter(int count, int min, int max) {
		this.count = count;
		this.min = min;
		this.max = max;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;

	}

	

}
