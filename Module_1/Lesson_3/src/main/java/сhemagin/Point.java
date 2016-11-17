package chemagin;

/**
 *Class Класс, описывающий точку, и, вычисляющий расстояние между двумя точками.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

public class Point {
	public double x;
	public double y;

/**
 *Конструктор объекта "Point".
 *@param x координата точки по оси x.
 *@param y координата точки по оси y.
 */

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

/**
 *Метод, вычисляющий длину между двумя точками.
 @param point точка.
 @return результат.
 */

	public double distanceTo(Point point) {
		return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
	}
}