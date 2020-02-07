package by.htp.test01.main;

/* 1. Создайте класс Test1 двумя переменными. 
 * Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, 
и метод, который находит наибольшее значение
из этих двух переменных.
 */

public class Test1 {

	int a = 4;
	int b = 7;

	public int getChangeA() {
		return a;
	}

	public void setChangeA(int a) {

		this.a = a;
	}

	public int getChangeB() {
		return b;
	}

	public void setChangeB(int b) {

		this.b = b;
	}

	public int getSum() {
		int sum;
		sum = this.a + this.b;

		return sum;
	}

	public int getMaxValue() {
		int max;
		if (this.a > this.b) {
			max = this.a;
		} else {
			max = this.b;
		}
		return max;

	}

	public void print() {
		System.out.println("a = " + this.a + "  b = " + this.b);
	}

	public void printSum(int sum) {
		System.out.println("Сумма : " + sum);
	}

	public void printMax(int max) {
		System.out.println("Наибольшее значение из двух чисел : " + max);
	}

}
