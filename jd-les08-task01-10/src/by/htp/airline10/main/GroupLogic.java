package by.htp.airline10.main;

import java.util.List;
import java.util.ArrayList;

public class GroupLogic {

	public List<Airline> listDestination(String userDestination, Group gr) {

		List<Airline> result = new ArrayList<Airline>();

		for (Airline a : gr.getAirline()) {

			if (a.getDestination().compareTo(userDestination) == 0) {

				result.add(a);
			}
		}

		return result;
	}

	public List<Airline> listDaysOfTheWeek(String userDaysOfTheWeek, Group gr) {

		List<Airline> result = new ArrayList<Airline>();

		for (Airline a : gr.getAirline()) {

			if (a.getDaysOfTheWeek().compareTo(userDaysOfTheWeek) == 0) {

				result.add(a);
			}
		}

		return result;
	}

	public List<Airline> listDaysOfTheWeekAndTimeDeparture(String userDay, int userHour, int userMin, Group gr) {

		List<Airline> result = new ArrayList<Airline>();

		for (Airline a : gr.getAirline()) {

			if (a.getDaysOfTheWeek().compareTo(userDay) == 0) {

				if (a.getHour() > userHour) {

					result.add(a);
					
				} else if (a.getHour() == userHour) {
					
					if (a.getMin() > userMin) {
						result.add(a);
					}
				}
			}
		}

		return result;
	}
}
