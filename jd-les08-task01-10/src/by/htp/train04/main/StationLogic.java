package by.htp.train04.main;



public class StationLogic {

	public Train[] sortNumTrain(Station station) {

		Train[] trains = station.getTrains();

		int index = 0;
		Train minTrain;

		for (int i = 0; i < trains.length - 1; i++) {
			minTrain = trains[i];
			index = i;
			for (int j = i + 1; j < trains.length; j++) {

				if (minTrain.getNumberTrain() > trains[j].getNumberTrain()) {

					minTrain = trains[j];
					index = j;

					Train temp = trains[i];
					trains[i] = minTrain;
					trains[index] = temp;
				}
			}

		}

		return trains;
	}

	public Train[] sortDestination(Station station) {

		Train[] trains = station.getTrains();

		Train minTrain;
		Train minTrain2;

		int index;

		for (int i = 0; i < trains.length - 1; i++) {

			minTrain = trains[i];
			index = i;

			for (int j = i + 1; j < trains.length; j++) {

				String str1 = minTrain.getDestination();
				String str2 = trains[j].getDestination();

				if (str1.compareTo(str2) > 0) {
					minTrain = trains[j];
					index = j;

				} else if (str1.compareTo(str2) == 0) {

					minTrain2 = sortTime(minTrain, trains[j]);

					if (minTrain2 != minTrain) {
						index = j;

					}
					minTrain = minTrain2;
				}

			}
			Train temp = trains[i];
			trains[i] = minTrain;
			trains[index] = temp;

		}
		return trains;
	}

	public Train sortTime(Train minTrain, Train trains) {

		if (minTrain.getDate().getHour() > trains.getDate().getHour()) {

			minTrain = trains;

		}
		if (minTrain.getDate().getHour() == trains.getDate().getHour()) {

			if (minTrain.getDate().getMinute() > trains.getDate().getMinute()) {

				minTrain = trains;
			}
		}
		return minTrain;
	}

	public Train infoTrain(Station station, int num) {

		Train[] trains = station.getTrains();

		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getNumberTrain() == num) {
				return trains[i];
			}
		}

		return null;
	}
}
