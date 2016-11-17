package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Calculator.
 *
 *@author Chemagin Evgeny
 *@version 1
 *@since 17.11.2016
 */

public class CalculatorTest {

	/**
	 * Тест метода, выполняющего сложение.
	 */

	@Test
	public void whenAddSumShouldSummateIt() {
		final Calculator calc = new Calculator();
		assertThat(calc.addSum(1, 1), is(2d));
	}

	/**
	 * Тест метода, выполняющего вычитание.
	 */

	@Test
	public void whenAddSubShouldSubstractIt() {
		final Calculator calc = new Calculator();
		assertThat(calc.addSub(2, 2), is(0d));
	}

	/**
	 * Тест метода, выполняющего умножение.
	 */

	@Test
	public void whenAddMultShouldMultiplicateIt() {
		final Calculator calc = new Calculator();
		assertThat(calc.addMult(1, 2), is(2d));
	}

	/**
	 * Тест метода, выполняющего деление.
	 */

	@Test
	public void whenAddDivShouldDivisionIt() {
		final Calculator calc = new Calculator();
		assertThat(calc.addDiv(2, 2), is(1d));
	}
}