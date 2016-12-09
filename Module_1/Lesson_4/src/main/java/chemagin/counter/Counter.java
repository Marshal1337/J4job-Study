package chemagin.counter;

/**
 *Class  класс, складывающий четные числа в диапазоне.
 *@author Chemagin Evgeny
 *@version 1
 *@since 9.12.2016
 */

public class Counter {

/**
 *метод, возвращающий результат сложения.
 *@param start первое число.
 *@param finish второе число.
 *@return result результат.
 */

	public int add(int start, int finish) {
		int result = 0;
		while (start <= finish) {
			if (start % 2 == 0) {
				result = result + start;
				start = start + 2;
			} else {
				start++;
			}
		}
		return result;
	}
}