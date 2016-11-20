package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Triangle.
 *@author Chemagin Evgeny
 *@version 1
 *@since 20.11.2016
 */

public class TriangleTest {

/**
 *Тест метода, вычисляющего площадь треугольника.
 */

	@Test
	public void whenPointsAreSuitablethenreturnArea() {
		final double res = 6.000000000000946;
		final Point a = new Point(24.00, 13.00);
		final Point b = new Point(12.00, 7.00);
		final Point c = new Point(36.00, 18.00);
		final Triangle triangle = new Triangle(a, b, c);
		assertThat(triangle.area(), is(res));
	}

/**
 *Тест метода, вычисляющего площадь треугольника, проверив его на существование.
 */

	@Test
	public void whenPointsisLinearThenTriangledoesnotexist() {
		final double res = 0d;
		final Point a = new Point(12.00, 13.00);
		final Point b = new Point(12.00, 7.00);
		final Point c = new Point(12.00, 18.00);
		final Triangle triangle = new Triangle(a, b, c);
		assertThat(triangle.area(), is(res));
	}
}