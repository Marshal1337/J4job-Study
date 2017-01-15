package chemagin.bubble;

/**
*Class класс, сортирующий массив.
 **@author Chemagin Evgeny
 *@version 1
 *@since 17.12.2016
 */

public class Bubble {

/**
 *Метод, сортирующий массив.
 @param values входящий массив.
 @return отсортированный массив.
 */

	public int[] bubbleSort(int[] values) {
		int checker = values.length;
		while (checker != 0) {
			for (int index = 0; index < values.length - 1; index++) {
				if (values[index] > values[index + 1]) {
					int save = values[index];
					values[index] = values[index + 1];
					values[index + 1] = save;
				}
			}
			checker--;
		}
		return values;
	}
}