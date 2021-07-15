package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.example.demo.Calculator;

/**
 * TDD: Test Driven Development
 */
class CalculatorTest extends BaseTest{

	// Class under test o SUT
	Calculator calculator = new Calculator();
	
//	/**
//	 * Se ejecuta una vez solo al principio de todo
//	 * @throws Exception
//	 */
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//		System.out.println("setUpBeforeClass");
//	}
//	/**
//	 * Se ejecuta una vez solo al final del todo
//	 * @throws Exception
//	 */
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//		System.out.println("tearDownAfterClass");
//	}

	/**
	 * Se ejecuta antes de cada método de test, una vez por cada test que haya
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp");
	}

	/**
	 * Se ejecuta después de cada método de test, una vez por cada test que haya
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Tag("calculations")
	@Test
	@DisplayName("Test suma numeros negativos (-1, -2)")
	void testNumbersNegative() {
		System.out.println("testNumbersNegative");
		int result = calculator.sum(-1, -2);
		assertEquals(-3, result);
	}
	
	@Test
	@DisplayName("Test suma cero")
	void testSumZero() {
		System.out.println("testSumZero");
		int result = calculator.sum(0, 0);
		assertEquals(0, result);
	}
	
	@Test
	@DisplayName("Suma positiva (1, 10)")
	void testSumPositive() {
		System.out.println("testSumPositive");
		int result = calculator.sum(1, 10);
		assertEquals(11, result);
	}


	@Test
	@DisplayName("Resta cero")
	void testSubZero() {
		System.out.println("testSubZero");
		assertEquals(0, calculator.sub(5, 5));
	}
	
	@Test
	@DisplayName("Resta resultado cero con numeros negativos")
	void testSubNegative() {
		System.out.println("testSubNegative");
		assertEquals(0, calculator.sub(-5, -5));
	}
	
	@Test
	@DisplayName("Comprobar numero par verdadero")
	void testEvenNumberTrue() {
		System.out.println("testEvenNumberTrue");
		boolean result = calculator.isEven(6);
		assertTrue(result);
	}
	
	@Test
	@DisplayName("Comprobar numero par falso")
	void testEvenNumberFalse() {

		System.out.println("testEvenNumberFalse");
		boolean result = calculator.isEven(5);
		assertFalse(result);
	}
	
	@Test
	@DisplayName("Comprobar numero impar verdadero")
	void testIsOddNumberTrue() {
		System.out.println("testIsOddNumberTrue");
		boolean result = calculator.isOdd(5);
		assertTrue(result);
	}
	
	@Test
	@DisplayName("Comprobar numero impar falso")
	void testIsOddNumberFalse() {
		System.out.println("testIsOddNumberFalse");
		boolean result = calculator.isOdd(6);
		assertFalse(result);
	}

}
