package chemagin;

/**
 * Class ����� ��� ���������� �������������� �������� ��������, ���������, ��������� � �������.
 * @author Chemagin Evgeny
 * @since 17.11.2016
 * @version 1
 */

public class Calculator {

	/**
	 * ��������.
	 * @param first ������ ��������.
	 * @param second ������ ��������.
	 * @return ���������.
	 */

	public double addSum(double first, double second) {
		return first + second;
	}

	/**
	 * ���������.
	 * @param first ������ ��������.
	 * @param second ������ ��������.
	 * @return ���������.
	 */

	public double addSub(double first, double second) {
		return first - second;
	}

	/**
	 * ���������.
	 * @param first ������ ��������.
	 * @param second ������ ��������.
	 * @return ���������.
	 */

	public double addMult(double first, double second) {
		return first * second;
	}

	/**
	 * �������.
	 * @param first ������ ��������.
	 * @param second ������ ��������.
	 * @return ���������.
	 */

	public double addDiv(double first, double second) {
		return first / second;
	}
}