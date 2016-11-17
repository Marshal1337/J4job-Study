package chemagin;

/**
 * Class Класс для вычисления арифметических операций сложения, вычитания, умножения и деления.
 * @author Chemagin Evgeny
 * @since 17.11.2016
 * @version 1
 */

public class Calculator {

	/**
	 * Сложение.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 * @return результат.
	 */

	public double addSum(double first, double second) {
		return first + second;
	}

	/**
	 * Вычитание.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 * @return результат.
	 */

	public double addSub(double first, double second) {
		return first - second;
	}

	/**
	 * Умножение.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 * @return результат.
	 */

	public double addMult(double first, double second) {
		return first * second;
	}

	/**
	 * Деление.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 * @return результат.
	 */

	public double addDiv(double first, double second) {
		return first / second;
	}
}