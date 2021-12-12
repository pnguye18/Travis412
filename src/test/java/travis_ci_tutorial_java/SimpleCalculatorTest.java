package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	public void testMultiple() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(1, 2), 2);
	}
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(6, 3), 2);
	}
	public void testDivideByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(6, 0), 2);
	}
}
