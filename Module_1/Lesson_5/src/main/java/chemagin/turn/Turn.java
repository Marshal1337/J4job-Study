package chemagin.turn;

/**
 *Class класс, переворачивающий массив.
 **@author Chemagin Evgeny
 *@version 1
 *@since 14.12.2016
 */

public class Turn {

/**
 *метод, переворачивающий массив.
 @param values входящий массив.
 @return перевернутый массив.
 */

	public int[] back(int[] values) {
		for (int index = 0; index < ((values.length - 1) / 2); index++) {
			int save = values[index];
			values[index] = values[(values.length - 1) - index];
			values[(values.length - 1) - index] = save;
		}
		return values;
	}
}