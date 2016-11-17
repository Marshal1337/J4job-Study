package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest{
	@Test
	public void whendistanceToReturndistance(){
		final Point a = new Point(2.00, 3.00);
		final Point b = new Point(3.00, 4.00);
		double sideAB = a.distanceTo(b);
		assertThat (sideAB, is(1.4142135623730951));
	}
}