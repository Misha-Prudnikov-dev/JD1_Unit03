package by.htp.test02.main;

/* 2. Создйте класс Test2 двумя переменными. 
*Добавьте конструктор с входными параметрами. Добавьте конструктор,
инициализирующий члены класса по умолчанию. 
Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Main {

	public static void main(String[] args) {

		Test2 t2 = new Test2(7, 3);

		System.out.println(t2.getA() + " " + t2.getB());

		Test2 t3 = new Test2();

		System.out.println(t3.getA() + " " + t3.getB());
	}

}
