package chemagin.turn;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Turn.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.12.2016
 */

public class TurnTest {

/**
 *Тест метода back.
 */

	@Test
	public void turningArray() {
		Turn turn = new Turn();
		final int[] expectArray = new int[] {1, 2, 3, 4, 5};
		final int[] resultArray = new int[] {5, 4, 3, 2, 1};
		assertThat(turn.back(resultArray), is(expectArray));
	}
}