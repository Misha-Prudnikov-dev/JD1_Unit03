package by.htp.triangle07.main;

public class TriangleLogic {

	public double perimeter(Triangle t) {

		double p;

		p = t.getA() + t.getB() + t.getC();

		return p;
	}

	public double square(Triangle t) {

		double pl;
		double halfPeremeter = perimeter(t) / 2;

		pl = Math.sqrt(
				halfPeremeter * (halfPeremeter - t.getA()) * (halfPeremeter - t.getB()) * (halfPeremeter - t.getC()));

		return pl;
	}

	public static double getMedian(Triangle t) {
		double median = (t.getA() + t.getB() + t.getC()) / 3;

		return median;
	}

}
