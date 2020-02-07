package by.htp.time06.main;

public class TimeLogic {

	public void checkAndSetTime(Time t) {

		if (t.getHour() < 0 & t.getHour() > 23) {

			t.setHour(0);

		} else {
			t.setHour(t.getHour());
		}
		if (t.getMinute() < 0 & t.getMinute() > 59) {
			t.setMinute(0);
		} else {
			t.setMinute(t.getMinute());
		}
		if (t.getSecond() < 0 & t.getSecond() > 59) {
			t.setSecond(0);
		} else {
			t.setSecond(t.getSecond());
		}
	}

	public void changeHour(int hour, Time t) {

		if (hour > 23) {

			t.setHour(0);

		} else {
			t.setHour(hour);
		}
	}

	public void changeMinute(int minute, Time t) {

		if (minute > 59) {

			t.setMinute(0);
		} else {
			t.setMinute(minute);
		}
	}

	public void changeSecond(int second, Time t) {

		if (second > 59) {

			t.setSecond(0);

		} else {
			t.setSecond(second);
		}
	}

	public void addTime(int hour, int minute, int second, Time t) {

		int changeSek;
		int changeMin;
		int changeHour;

		changeSek = (t.getSecond() + second) % 60;
		changeMin = (t.getMinute() + (t.getSecond() + second) / 60 + minute) % 60;
		changeHour = (t.getHour() + ((t.getMinute() + (t.getSecond() + second) / 60)) / 60 + hour) % 24;

		t.setHour(changeHour);
		t.setMinute(changeMin);
		t.setSecond(changeSek);
		
	}

}
