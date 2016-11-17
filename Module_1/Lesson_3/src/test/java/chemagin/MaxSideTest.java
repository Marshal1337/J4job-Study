package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxSideTest{
	@Test
	public void whenSideBCisMaxThenreturnSideBC(){
		final Point a = new Point(24.00, 13.00);
		final Point b = new Point(12.00, 7.00);
		final Point c = new Point(36.00, 18.00);	
		final MaxSide maxside = new MaxSide();
		assertThat (maxside.max(a.distanceTo(b), a.distanceTo(c), b.distanceTo(c)), is(26.40075756488817));
	}
}