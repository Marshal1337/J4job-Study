package chemagin;

/**
 *Class  ласс, вычисл€юющий максимальное из двух чисел.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

 public class Max {

/**
 *ћетод, возвращающий максимальное из двух чисел.
 *@param first первое число.
 *@param second второе число.
 *@return result результат.
 */

	public int max(int first, int second) {
		int result = first > second ? first : second;
		return result;
	}

/**
 *ћетод, возвращающий максимальное из трЄх чисел.
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