package by.htp.customer08.main;

import java.util.List;
import java.util.Scanner;

/*
 Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {

	public static void main(String[] args) {

		Group group = new Group();
		GroupLogic groupLog = new GroupLogic();

		group.add(new Customer("Alisa", "Kayfman", "Leonidovna", "Nezalejnost1", 3019, 9099, 7589));
		group.add(new Customer("Disa", "Layfman", "Feonidovna", "Nezalejnost2", 3018, 9097, 7584));
		group.add(new Customer("Bob", "Rayfman", "Jeonidovna", "Nezalejnost3", 3017, 9093, 7586));
		group.add(new Customer("Cat", "Tayfman", "Peonidovna", "Nezalejnost4", 3016, 9098, 7583));
		group.add(new Customer("Enot", "Gayfman", "Seonidovna", "Nezalejnost5", 3015, 9092, 7581));

		List<Customer> customers;
		customers = group.getCustomers();

		// print(customers);

		System.out.println("Список покупателей по алфавиту : ");

		customers = GroupLogic.sortAlphabet(group);

		print(customers);

		Scanner sc = new Scanner(System.in);

		System.out.println("Список покупателей с кредитной картой в заданном интервале : ");

		System.out.println("Введите min значение : ");

		int start = sc.nextInt();

		System.out.println("Введите max значение : ");

		int end = sc.nextInt();

		sc.close();

		customers = GroupLogic.getIntervalCreditCardNumber(start, end, group);

		print(customers);
	}

	public static void print(List<Customer> customers) {

		System.out.println(" ");

		for (Customer cst : customers) {

			System.out.println(cst);
		}
		System.out.println(" ");

	}

}
