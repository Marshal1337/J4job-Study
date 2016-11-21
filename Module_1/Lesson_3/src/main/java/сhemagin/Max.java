package chemagin;

/**
 *Class  ласс, вычисл¤ющий максимальное из двух чисел.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

 public class Max {

/**
 *ћетод, возвращающий максимальное из двух чисел.
 *@param first первое число.
 *@param second второе число.
 *@return результат.
 */

	public int max(int first, int second) {
		return first > second ? first : second;
	}

/**
 *ћетод, возвращающий максимальное из трЄх чисел.
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