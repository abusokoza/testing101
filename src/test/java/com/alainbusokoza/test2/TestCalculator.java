package com.alainbusokoza.test2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {
	
	@Test
	public void testAdd(){
		Calculator cal = new Calculator();
		double result = cal.add(5, 7);
		assertEquals("!!!", 13, result, 0);
	}

}
