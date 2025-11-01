package com.jntu.NM_JNTU_Calc_Application;

public class Calculator {
	
	public int add(int a, int b) {
        return a + b;
    }

    // This method will be flagged by our new rule
    private void unusedMethod() {
        System.out.println("I am not used.");
    }
}
