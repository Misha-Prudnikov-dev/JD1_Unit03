package by.htp.train04.main;

public class Station {
	private int realStationSize;
	private Train[] trains;

	public Station(int number) {
		trains = new Train[number];
		realStationSize = 0;
	}

	public boolean add(Train newTrain) {
		if (realStationSize >= trains.length) {
			return false;
		}
		trains[realStationSize] = newTrain;
		realStationSize++;
		return true;
	}

	public Train[] getTrains() {
		return trains;
	}

	public void setTrains(Train[] trains) {
		this.trains = trains;
	}

}
