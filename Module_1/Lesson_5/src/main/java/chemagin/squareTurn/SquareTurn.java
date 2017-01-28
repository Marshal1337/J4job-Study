package chemagin.squareTurn;

/**
 *Class класс, переворачивающий квадратный двумерный массив.
 **@author Chemagin Evgeny
 *@version 1
 *@since 17.12.2016
 */

public class SquareTurn {

/**
 *метод, переворачивающий квадратный двумерный массив.
 @param values входящий квадратный двумерный массив.
 @return перевернутый массив.
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