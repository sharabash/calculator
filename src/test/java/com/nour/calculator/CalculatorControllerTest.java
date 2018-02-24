package com.nour.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorControllerTest {
	private CalculatorController calculator = new CalculatorController();

	@Test
	public void testSum() {
		assertEquals("5", calculator.sum(2, 3));
	}
}
