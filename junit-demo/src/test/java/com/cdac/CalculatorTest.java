package com.cdac;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add_is_working_or_not() {
		Calculator c = new Calculator();
		int actualResult = c.add(10, 20);
		int expectedResult = 30;
		assertEquals(expectedResult, actualResult);
		//NO NO NO NO NO
		//System.out.println(result);
	}

	@Test
	public void sub_is_working_or_not() {
		Calculator c = new Calculator();
		int actualResult = c.sub(10, 20);
		int expectedResult = -10;
		assertEquals(expectedResult, actualResult);
	}

}
