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
		int counter = 0;
		for (int index1 = 0; index1 < values.length; index1++) {
			for (int index2 = index1 + 1; index2 < values.length; index2++) {
				if (values[index1] == values[index2] && values[index1] != null) {
					counter++;
					values[index2] = values[values.length - counter];
					values[values.length - counter] = null;
					index2--;
				}
			}
		}
		values = Arrays.copyOf(values, values.length - counter);
		return values;
	}
}