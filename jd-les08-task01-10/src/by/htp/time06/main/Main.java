package by.htp.time06.main;

/*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное
количество часов, минут и секунд.*/

public class Main {

	public static void main(String[] args) {

		Time t = new Time(13, 5, 5);

		TimeLogic tL = new TimeLogic();

		tL.checkAndSetTime(t);

		int h = t.getHour();
		int m = t.getMinute();
		int s = t.getSecond();

		System.out.println(h + " " + m + " " + s);

		tL.changeHour(9, t);
		tL.changeMinute(28, t);
		tL.changeSecond(59, t);

		printTime(t);

		tL.addTime(9, 29, 50, t);

		printTime(t);

	}

	public static void printTime(Time t) {

		System.out.println(t.getHour() + " " + t.getMinute() + " " + t.getSecond());

	}
}
