package by.htp.count05.main;
/*
 *  5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на
единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Main {
	public static void main(String[] args) {

		Counter counter = new Counter();

		Counter counter2 = new Counter(12, 3, 1);

		CounterLogic counterLogic = new CounterLogic();

		counterLogic.increaseCount(counter);

		counterLogic.currentCount(counter);

	}

}
