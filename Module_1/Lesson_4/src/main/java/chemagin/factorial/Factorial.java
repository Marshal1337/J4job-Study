package chemagin.factorial;

/**
 *Class  класс, находящий факториал числа.
 *@author Chemagin Evgeny
 *@version 1
 *@since 9.12.2016
 */

public class Factorial {

/**
 *метод, возвращающий результат.
 *@param n число, факториал которого нужно найти.
 *@return result результат.
 */

	public int factorialres(int n) {
		int result = n;
		do {
			result = result * (n - 1);
			n--;
		} while (n > 1);
		return result;
	}
}