package chemagin;

/**
 *Class Класс, вычисляющий максимальное из двух чисел.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

 public class Max {

/**
 *Метод, возвращающий максимальное из двух чисел.
 *@param first первое число.
 *@param second второе число.
 *@return result результат.
 */

	public int max(int first, int second) {
		int result = first > second ? first : second;
		return result;
	}

/**
 *Метод, возвращающий максимальное из трёх чисел.
 *@param first первое число.
 *@param second второе число.
 *@param third третье число.
 *@return result результат.
 */
	public int triplemax(int first, int second, int third) {
		int result = this.max(first, second) > third ? this.max(first, second) : third;
		return result;
	}
}