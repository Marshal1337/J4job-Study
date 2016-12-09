package chemagin.counter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Counter.
 *@author Chemagin Evgeny
 *@version 1
 *@since 9.12.2016
 */

public class CounterTest {

/**
 *Тест метода add.
 */

	@Test
	public void countertest() {
		final Counter count = new Counter();
		final int start = 2;
		final int finish = 10;
		final int result = 30;
		assertThat(count.add(start, finish), is(result));
	}
}