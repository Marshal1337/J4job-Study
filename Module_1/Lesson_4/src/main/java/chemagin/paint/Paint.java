package chemagin.paint;

/**
 *Class класс, строящий пирамиду.
 *@author Chemagin Evgeny
 *@version 1
 *@since 09.12.2016
 */

public class Paint {

/**
 *Метод, строящий пирамиду.
 *@param h высота пирамиды.
 *@return результат.
 */

	public String piramid(int h) {
		StringBuilder sb = new StringBuilder();
		int i = 1;
		while (i <= h) {
			for (int k = 0; k <= (h - i); k++) {
				sb.append(" ");
			}
			for (int j = 1; j <= i; j++) {
				sb.append("^ ");
			}
			i++;
			sb.append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}
}