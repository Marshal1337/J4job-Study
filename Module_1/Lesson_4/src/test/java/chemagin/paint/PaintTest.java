package chemagin.paint;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import com.google.common.base.Joiner;

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
		final Joiner joiner = Joiner.on(System.getProperty("line.separator"));
		final String result = joiner.join("   ^ ", "  ^ ^ ", " ^ ^ ^ ");
		assertThat(paint.piramid(h), is(result));
	}
}