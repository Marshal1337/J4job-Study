package chemagin;

/**
 *Class Класс, описывающий треугольник, и, вычисляющий его площадь.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

public class Triangle {

/**
 * Поле, объявляющее точку A.
 */

	private	Point a;

/**
 * Поле, объявляющее точку B.
 */

	private Point b;

/**
 * Поле, объявляющее точку C.
 */

	private Point c;

/**
 *Конструктор объекта "Triangle".
 *@param a точка A.
 *@param b точка B.
 *@param c точка С.
 */

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

/**
 *Метод, вычисляющий площадь треугольника, и, проверяющий его на существование.
 *@return result результат.
 */

	public double area() {
		double sideAB = this.a.distanceTo(b);
		double sideAC = this.a.distanceTo(c);
		double sideBC = this.b.distanceTo(c);
		double result = 0;
		if (sideAB + sideAC > sideBC && sideAB + sideBC > sideAC && sideBC + sideAC > sideAB) {
			double semiperimeter = (sideAB + sideAC + sideBC) / 2;
			result = Math.sqrt(semiperimeter * (semiperimeter - sideAB) * (semiperimeter - sideAC) * (semiperimeter - sideBC));
		} else {
			System.out.println("Triangle does not exist.");
		}
		return result;
	}
}