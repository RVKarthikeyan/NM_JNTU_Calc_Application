package com.jntu.nm_jntu_calc_application;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
     // This is a deliberate failure: expecting 9, but 5+3=8
        assertEquals("5 + 3 should equal 9", 9, calc.add(5, 3));
    }
}