package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for MaxSide.
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

public class MaxSideTest {

/**
 *Тест метода, вычисляющего самую длинную сторону треугольника.
 */

	@Test
	public void whenSideBCisMaxThenreturnSideBC() {
		final double res = 26.40075756488817;
		final Point a = new Point(24.00, 13.00);
		final Point b = new Point(12.00, 7.00);
		final Point c = new Point(36.00, 18.00);
		final MaxSide maxside = new MaxSide();
		assertThat(maxside.max(a.distanceTo(b), a.distanceTo(c), b.distanceTo(c)), is(res));
	}
}