package by.htp.train04.main;
/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
быть упорядочены по времени отправления.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num;
		Station station = new Station(5);
		Train[] trains;
		Train trainsInfo;
		StationLogic stationLogic = new StationLogic();

		station.add(new Train("Minsk", 7, new Date(2019, "September", 14, 22, 40)));
		station.add(new Train("Vitebsk", 4, new Date(2019, "September", 19, 10, 15)));
		station.add(new Train("Brest", 9, new Date(2019, "September", 15, 11, 10)));
		station.add(new Train("Grodno", 2, new Date(2019, "September", 10, 15, 20)));
		station.add(new Train("Minsk", 8, new Date(2019, "September", 12, 22, 45)));

		trains = stationLogic.sortNumTrain(station);
		print(trains);

		trains = stationLogic.sortDestination(station);

		print(trains);

		System.out.println("Введите номер поезда");

		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {

			System.out.println("Введите номер поезда");
			
			sc.next();
		}
		num = sc.nextInt();

		trainsInfo = stationLogic.infoTrain(station, num);
		printInfo(trainsInfo);
	}

	public static void print(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			System.out.println(trains[i].getDestination() + " Num " + trains[i].getNumberTrain() + " Time "
					+ trains[i].date.getHour() + " " + trains[i].date.getMinute());

		}
		System.out.println("------------------------");
	}

	public static void printInfo(Train trains) {
		System.out.println("Destination - " + trains.getDestination());
		System.out.println("Number Train - " + trains.getNumberTrain());
		System.out.println("Year - " + trains.getDate().getYear());
		System.out.println("Month - " + trains.getDate().getMonth());
		System.out.println("Day - " + trains.getDate().getNumDay());
		System.out.println("Time - " + trains.getDate().getHour() + " h " + trains.getDate().getMinute() + " min ");

	}

}
