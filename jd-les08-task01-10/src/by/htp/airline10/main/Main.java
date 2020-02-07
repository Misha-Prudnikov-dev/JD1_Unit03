package by.htp.airline10.main;

/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Group gr = new Group();

		GroupLogic grLog = new GroupLogic();

		gr.add(new Airline("Berlin", 45, "Boeing-455", 14, 58, "Sunday"));
		gr.add(new Airline("New-York", 47, "Boeing-455", 10, 10, "Sunday"));
		gr.add(new Airline("Paris", 44, "Boeing-455", 21, 18, "Wednesday"));
		gr.add(new Airline("Minsk", 43, "Boeing-455", 12, 30, "Saturday"));
		gr.add(new Airline("Dublin", 48, "Boeing-455", 22, 10, "Sunday"));

		List<Airline> airline;

		airline = gr.getAirline();

		System.out.println("Список всех рейсов");

		print(airline);
		Scanner sc = new Scanner(System.in);

		System.out.println("Cписок рейсов для заданного пункта назначения");
		System.out.println("Введите  пункт назначения : ");

		String userDestination = sc.nextLine();

		airline = grLog.listDestination(userDestination, gr);

		print(airline);

		System.out.println("Cписок рейсов для заданного дня недели");
		System.out.println("Введите день недели : ");

		String userDaysOfTheWeek = sc.nextLine();

		airline = grLog.listDaysOfTheWeek(userDaysOfTheWeek, gr);

		print(airline);

		System.out.println("Cписок рейсов для заданного дня недели, время вылета для которых больше заданного : ");
		System.out.println("Введите день недели : ");

		String userDay = sc.nextLine();

		System.out.println("Введите время вылета (час) : ");

		int userHour = sc.nextInt();

		System.out.println("Введите время вылета (минуты) : ");

		int userMin = sc.nextInt();

		airline = grLog.listDaysOfTheWeekAndTimeDeparture(userDay, userHour, userMin, gr);

		print(airline);
	}

	public static void print(List<Airline> airline) {

		System.out.println(" ");

		for (Airline a : airline) {

			System.out.println(a);
		}
		System.out.println(" ");
	}

}
