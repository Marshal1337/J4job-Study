package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Point.
 *@author Chemagin Evgeny
 *@version 1
 *@since 20.11.2016
 */

public class PointTest {

/**
 *Тест метода, вычисляющего расстояние между точками.
 */

	@Test
	public void whendistanceToReturndistance() {
		final double res = 1.4142135623730951;
		final Point a = new Point(2.00, 3.00);
		final Point b = new Point(3.00, 4.00);
		double sideAB = a.distanceTo(b);
		assertThat(sideAB, is(res));
	}
}