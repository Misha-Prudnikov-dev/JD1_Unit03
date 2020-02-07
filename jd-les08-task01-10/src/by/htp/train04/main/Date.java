package by.htp.train04.main;

public class Date {
	private int year;
	private String month;
	private int numDay;
	private int hour;
	private int minute;

	public Date(int year, String month, int numDay, int hour, int minute) {

		this.year = year;
		this.month = month;
		this.numDay = numDay;
		this.hour = hour;
		this.minute = minute;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getNumDay() {
		return numDay;
	}

	public void setNumDay(int numDay) {
		this.numDay = numDay;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

}
