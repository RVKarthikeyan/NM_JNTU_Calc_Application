package com.jntu.nm_jntu_calc_application;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals("5 + 3 should equal 8", 8, calc.add(5, 3));
    }
}