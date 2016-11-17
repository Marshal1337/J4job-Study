package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest{
	@Test
	public void calculate(){
		final Square square = new Square((float)2.0, (float)3.0, (float)4.0);
		assertThat (square.calculate(2), is(18.0f));
	}
}
