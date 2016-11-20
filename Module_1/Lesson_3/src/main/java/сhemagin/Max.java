package chemagin;

/**
 *Class �����, ������������ ������������ �� ���� �����.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

 public class Max {

/**
 *�����, ������������ ������������ �� ���� �����.
 *@param first ������ �����.
 *@param second ������ �����.
 *@return result ���������.
 */

	public int max(int first, int second) {
		int result = first > second ? first : second;
		return result;
	}

/**
 *�����, ������������ ������������ �� ��� �����.
 *@param first ������ �����.
 *@param second ������ �����.
 *@param third ������ �����.
 *@return result ���������.
 */
	public int triplemax(int first, int second, int third) {
		int result = this.max(first, second) > third ? this.max(first, second) : third;
		return result;
	}
}