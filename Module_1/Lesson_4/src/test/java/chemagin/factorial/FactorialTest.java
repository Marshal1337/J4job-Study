package chemagin.factorial;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Factorial.
 *@author Chemagin Evgeny
 *@version 1
 *@since 9.12.2016
 */

public class FactorialTest {

/**
 *Тест метода метода, возвращающего факториал числа.
 */

	@Test
	public void testingfactorial() {
		final Factorial fact = new Factorial();
		final int n = 4;
		final int result = 24;
		assertThat(fact.factorialres(n), is(result));
	}
}