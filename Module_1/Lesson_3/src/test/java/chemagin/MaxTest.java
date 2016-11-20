package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Max.
 *@author Chemagin Evgeny
 *@version 1
 *@since 20.11.2016
 */

public class MaxTest {

/**
 *���� ������ max, ��� ������� ��� ������ ����� ������������.
 */

	@Test
	public void ifFirstisMaxthenreturnFirst() {
		final Max maxfirst = new Max();
		final int first = 10;
		final int second = 5;
		assertThat(maxfirst.max(first, second), is(first));
	}

/**
 *���� ������ max, ��� ������� ��� ������ ����� ������������.
 */

	@Test
	public void ifSecondisMaxthenreturnSecond() {
		final Max maxsecond = new Max();
		final int first = 5;
		final int second = 10;
		assertThat(maxsecond.max(first, second), is(second));
	}

/**
 *���� ������ triplemax, ��� ������� ��� ������ ����� ������������.
 */

	@Test
	public void ifThirdisMaxthenreturnThird() {
		final Max maxthird = new Max();
		final int first = 5;
		final int second = 10;
		final int third = 15;
		assertThat(maxthird.triplemax(first, second, third), is(third));
	}

/**
 *���� ������ triplemax, ��� ������� ��� ������ ����� �� ������������.
 */

	@Test
	public void ifThirdisnotMaxthenreturnAnother() {
		final Max maxAnother = new Max();
		final int first = 5;
		final int second = 10;
		final int third = 7;
		assertThat(maxAnother.triplemax(first, second, third), is(maxAnother.max(first, second)));
	}
}