package by.htp.triangle07.main;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
*/

public class Triangle {

	private int a;
	private int b;
	private int c;

	public Triangle() {
		a = 4;
		b = 5;
		c = 6;

	}

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
