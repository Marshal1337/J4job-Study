package chemagin.dublicate;
import java.util.Arrays;

/**
 *Class класс, удаляющий дубликаты в массиве.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.12.2016
 */

public class Dublicate {

/**
 *метод, форматирующий массив.
 @param values входящий массив.
 @return отформатированный массив.
 */

	public String[] delDublicate(String[] values) {
		for (int index1 = 0; index1 < values.length; index1++) {
			for (int index2 = index1 + 1; index2 < values.length; index2++) {
				if (values[index1] == values[index2]) {
					values[index2] = null;
					for (int index3 = index2; index3 < values.length - 1; index3++) {
						values[index3] = values[index3 + 1];
					}
					values = Arrays.copyOf(values, values.length - 1);
					index2--;
				}
			}
		}
		return values;
	}
}