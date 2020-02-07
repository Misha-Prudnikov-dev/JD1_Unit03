package by.htp.airline10.main;

import java.util.List;
import java.util.ArrayList;

public class Group {

	private List<Airline> airline;

	public Group() {
		airline = new ArrayList<Airline>();
	}

	public List<Airline> add(Airline newAirline) {
		airline.add(newAirline);

		return airline;
	}

	public List<Airline> getAirline() {
		return airline;
	}

	public void setAirline(List<Airline> airline) {
		this.airline = airline;
	}

}
