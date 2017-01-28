package chemagin.bubble;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Bubble.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.12.2016
 */

 public class BubbleTest {

/**
 *Тест метода back.
 */

	@Test
	public void sortArray() {
		Bubble bubble = new Bubble();
		final int[] expectArray = new int[] {1, 2, 3, 4, 5};
		final int[] resultArray = new int[] {2, 3, 5, 1, 4};
		assertThat(bubble.bubbleSort(resultArray), is(expectArray));
	}
 }