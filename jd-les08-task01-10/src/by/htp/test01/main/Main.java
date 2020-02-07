package by.htp.test01.main;

/* 1. Создайте класс Test1 двумя переменными. 
 * Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, 
и метод, который находит наибольшее значение
из этих двух переменных.
 */
public class Main {

	public static void main(String[] args) {

		Test1 t = new Test1();

		t.setChangeA(6);
		t.setChangeB(4);
		t.print();
		int sum = t.getSum();
		t.printSum(sum);
		int max = t.getMaxValue();
		t.printMax(max);
	}

}
