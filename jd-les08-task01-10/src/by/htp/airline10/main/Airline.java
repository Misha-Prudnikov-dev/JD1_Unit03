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

public class Airline {

	private String destination;
	private int numberFlight;
	private String typePlane;

	private int hour;
	private int min;
	private String daysOfTheWeek;

	public Airline(String destination, int numberFlight, String typePlane, int hour, int min, String daysOfTheWeek) {

		this.destination = destination;
		this.numberFlight = numberFlight;
		this.typePlane = typePlane;
		this.hour = hour;
		this.min = min;
		this.daysOfTheWeek = daysOfTheWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberFlight() {
		return numberFlight;
	}

	public void setNumberFlight(int numberFlight) {
		this.numberFlight = numberFlight;
	}

	public String getTypePlane() {
		return typePlane;
	}

	public void setTypePlane(String typePlane) {
		this.typePlane = typePlane;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public String getDaysOfTheWeek() {
		return daysOfTheWeek;
	}

	public void setDaysOfTheWeek(String daysOfTheWeek) {
		this.daysOfTheWeek = daysOfTheWeek;
	}

	@Override
	public String toString() {
		return "Airline [ Destination : " + destination + ", Number Flight : " + numberFlight + ", Type Plane : "
				+ typePlane + ", Hour : " + hour + ", Min : " + min + ", Days of the week : " + daysOfTheWeek + " ]";
	}

}
