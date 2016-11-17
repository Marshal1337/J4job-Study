package chemagin;

/**
 *Class Класс, описывающий треугольник, и, вычисляющий его площадь.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

public class Triangle {
	public Point a;
	public Point b;
	public Point c;

/**
 *Конструктор объекта "Triangle".
 *@param a точка A.
 *@param b точка B.
 *@param c точка С.
 */

	public Triangle(Point a, Point b, Point c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

/**
 *Метод, вычисляющий площадь треугольника, и, проверяющий его на существование"
 *@param sideAB сторона AB.
 *@param sideAC сторона AC.
 *@param sideBC сторона BC.
 *@return результат.
 */

	public double area() {
		double sideAB = this.a.distanceTo(b);
		double sideAC = this.a.distanceTo(c);
		double sideBC = this.b.distanceTo(c);

		if (sideAB + sideAC > sideBC && sideAB + sideBC > sideAC && sideBC + sideAC > sideAB) {
			double semiperimeter = (sideAB + sideAC + sideBC) / 2;
			return Math.sqrt(semiperimeter * (semiperimeter - sideAB) * (semiperimeter - sideAC) * (semiperimeter - sideBC));
		} else {
			System.out.println("Triangle does not exist.");
			return -1.00;
		}
	}
}