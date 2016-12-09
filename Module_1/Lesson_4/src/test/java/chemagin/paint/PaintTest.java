package chemagin.paint;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test for Paint.
 *@author Chemagin Evgeny
 *@version 1
 *@since 09.12.2016
 */

public class PaintTest {

/**
 *Тест метода piramid.
 */

	@Test
	public void ifHisThreeThenBuildPipamid() {
		final Paint paint = new Paint();
		final int h = 3;
		final String result = "   ^ " + System.getProperty("line.separator") + "  ^ ^ " + System.getProperty("line.separator") + " ^ ^ ^ " + System.getProperty("line.separator");
		assertThat(paint.piramid(h), is(result));
	}
}