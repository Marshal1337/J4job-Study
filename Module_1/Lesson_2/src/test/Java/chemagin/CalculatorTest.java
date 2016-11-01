package chemagin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest{
	@Test
	public void WhenAddSumShouldSummateIt(){
	final Calculator calc = new Calculator();
	calc.addSum(1.01, 1.01);
	assertThat (calc.result, is(2.02));
	}
	
	@Test
	public void WhenAddSubShouldSubstractIt(){
	final Calculator calc = new Calculator();	
	calc.addSub(2.02, 2.02);
	assertThat (calc.result, is(0.0));
	}

	@Test
	public void WhenAddMultShouldMultiplicateIt(){
	final Calculator calc = new Calculator();	
	calc.addMult(3.03, 3.03);
	assertThat (calc.result, is(9.1809));
	}

	@Test
	public void WhenAddDivShouldDivisionIt(){
	final Calculator calc = new Calculator();	
	calc.addDiv(4.04, 4.04);
	assertThat (calc.result, is(1.0));
	}
}