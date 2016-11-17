package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest{
	@Test
	public void asdasfsadf(){
		final Factorial fact = new Factorial();
		assertThat (fact.factorialres(4), is(24));
	}
}