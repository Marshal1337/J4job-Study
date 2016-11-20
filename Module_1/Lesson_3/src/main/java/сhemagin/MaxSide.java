package chemagin;

/**
 *Class Класс, вычисляющий самую длинную сторону треугольника.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

public class MaxSide {

/**
 * Метод, вычисляющий самую длинную сторону треугольника.
 *@param sideAB сторона AB.
 *@param sideAC сторона AC.
 *@param sideBC сторона BC.
 *@return result результат.
 */

	public double max(double sideAB, double sideAC, double sideBC) {
		double result = sideBC;
		if (sideAB > sideAC && sideAB > sideBC) {
			result = sideAB;
		} else if (sideAC > sideAB && sideAC > sideBC) {
			result = sideAC;
		}
		return result;
	}
}