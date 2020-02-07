package by.htp.triangle07.main;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
*/

public class Main {


	public static void main(String[] args) {

		Triangle t = new Triangle();

		Triangle t2 = new Triangle(7, 8, 9);

		TriangleLogic tl = new TriangleLogic();

		print(tl, t);
		//print(tl, t2);

	}

	public static void print(TriangleLogic tl, Triangle t) {

		System.out.println(" Стороны треугольника ");
		System.out.println(" A = " + t.getA() + ", B = " + t.getB() + ", C = " + t.getC());

		System.out.println(" Периметр = " + tl.perimeter(t));
		System.out.println(" Площадь = " + tl.square(t));
		System.out.println(" Медиана = " + tl.getMedian(t));
		
		System.out.println(" ");
	}

	public static void print2(TriangleLogic tl, Triangle t2) {

		System.out.println(" Стороны треугольника ");
		System.out.println(" A = " + t2.getA() + ", B = " + t2.getB() + ", C = " + t2.getC());

		System.out.println(" Периметр = " + tl.perimeter(t2));
		System.out.println(" Площадь = " + tl.square(t2));
		System.out.println(" Медиана = " + tl.getMedian(t2));
	}



}
