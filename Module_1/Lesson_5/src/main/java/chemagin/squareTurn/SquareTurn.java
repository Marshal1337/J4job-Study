package chemagin.squareTurn;

/**
 *Class �����, ���������������� ���������� ��������� ������.
 **@author Chemagin Evgeny
 *@version 1
 *@since 17.12.2016
 */

public class SquareTurn {

/**
 *�����, ���������������� ���������� ��������� ������.
 @param values �������� ���������� ��������� ������.
 @return ������������ ������.
 */

	public int[][] turn(int[][] values) {
		int[][] resultArray = new int[values.length][values.length];
		for (int j = 0; j < values.length; j++) {
			for (int i = 0; i < values.length; i++) {
				resultArray[j][i] = values[i][(values.length - 1) - j];
			}
		}
		return resultArray;
	}
}