package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest{
	@Test
	public void whenPointsAreSuitablethenreturnArea(){
		final Point a = new Point(24.00, 13.00);
		final Point b = new Point(12.00, 7.00);
		final Point c = new Point(36.00, 18.00);
		final Triangle triangle = new Triangle(a, b, c);
		assertThat (triangle.area(), is(6.000000000000946));
	}

	@Test
	public void whenPointsisLinearThenTriangledoesnotexist(){
		final Point a = new Point(12.00, 13.00);
		final Point b = new Point(12.00, 7.00);
		final Point c = new Point(12.00, 18.00);
		final Triangle triangle = new Triangle(a, b, c);
		assertThat (triangle.area(), is(-1.00));
	}
}