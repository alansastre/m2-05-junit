package com.example.arantzadelbarrio;

import org.junit.jupiter.api.Test;

import com.example.demo.patterns.creational.singleton.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSingletonTest {

	@Test
	void testCalculator1() {
		
		Calculator calculator1 = Calculator.getCalculator();
		Calculator calculator2 = Calculator.getCalculator();
		assertSame(calculator1, calculator2);		
	}
	
}
