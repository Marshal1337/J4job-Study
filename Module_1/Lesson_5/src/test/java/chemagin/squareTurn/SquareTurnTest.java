package chemagin.squareTurn;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for SquareTurn.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.12.2016
 */

 public class SquareTurnTest {

/**
 *Тест метода turn.
 */

	@Test
	public void turningArray() {
		SquareTurn squareTurn = new SquareTurn();
		final int[][] startArray = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		final int[][] expectArray = new int[][] {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
		assertThat(squareTurn.turn(startArray), is(expectArray));
	}
}