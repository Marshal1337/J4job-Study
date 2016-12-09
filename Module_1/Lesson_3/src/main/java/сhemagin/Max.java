package chemagin;

/**
 *Class  класс, вычисляющий максимальное из двух чисел.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

 public class Max {

/**
 *метод, возвращающий максимальное из двух чисел.
 *@param first первое число.
 *@param second второе число.
 *@return результат.
 */

	public int max(int first, int second) {
		return first > second ? first : second;
	}

/**
 *метод, возвращающий максимальное из трех чисел.
 *@param first первое число.
 *@param second второе число.
 *@param third третье число.
 *@return результат.
 */

	public int triplemax(int first, int second, int third) {
		first = this.max(first, second);
		return this.max(first, third);
	}
}