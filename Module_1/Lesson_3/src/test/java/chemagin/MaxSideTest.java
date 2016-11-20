package chemagin;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

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
		final double res = 26.4d;
		final Point a = new Point(24.00, 13.00);
		final Point b = new Point(12.00, 7.00);
		final Point c = new Point(36.00, 18.00);
		final MaxSide maxside = new MaxSide();
		assertThat(maxside.max(a.distanceTo(b), a.distanceTo(c), b.distanceTo(c)), closeTo(res, 1));
	}

/**
 *Тест метода, вычисляющего самую длинную сторону треугольника.
 */

	@Test
	public void whenSideACisMaxThenreturnSideAC() {
		final double res = 26.4d;
		final Point a = new Point(12.00, 7.00);
		final Point b = new Point(24.00, 13.00);
		final Point c = new Point(36.00, 18.00);
		final MaxSide maxside = new MaxSide();
		assertThat(maxside.max(a.distanceTo(b), a.distanceTo(c), b.distanceTo(c)), closeTo(res, 1));
	}

/**
 *Тест метода, вычисляющего самую длинную сторону треугольника.
 */

	@Test
	public void whenSideABisMaxThenreturnSideAB() {
		final double res = 26.4d;
		final Point a = new Point(12.00, 7.00);
		final Point b = new Point(36.00, 18.00);
		final Point c = new Point(24.00, 13.00);
		final MaxSide maxside = new MaxSide();
		assertThat(maxside.max(a.distanceTo(b), a.distanceTo(c), b.distanceTo(c)), closeTo(res, 1));
	}
}