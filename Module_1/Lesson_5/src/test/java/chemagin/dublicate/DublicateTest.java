package chemagin.dublicate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Dublicate.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.12.2016
 */

public class DublicateTest {

/**
 *тест метода delDublicate.
 */

	@Test
	public void delDublicateTest() {
		Dublicate dublicate = new Dublicate();
		String[] expectArray = new String[] {"Привет", "Машина", "Привет", "Привет", "Холодильник"};
		String[] resultArray = new String[] {"Привет", "Машина", "Холодильник"};
		assertThat(dublicate.delDublicate(expectArray), is(resultArray));
	}
}