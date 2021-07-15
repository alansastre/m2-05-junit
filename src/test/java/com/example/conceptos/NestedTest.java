package com.example.conceptos;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Tests anidados para crear jerarquías de tests en los reportes de resultados
 * agrupando tests por concepto/categoria/tematica
 */
@DisplayName("Tests para funcionalidades Calculadora")
class NestedTest {

	// Test de nivel 1 (sin anidamiento)
	@Test
	@Disabled
	void test1() {
		System.out.println("Normal test 1");
	}
	
	// Clases Tests anidados
		// 1. Grupo Basic Calculator
	
	@Nested
	@DisplayName("Grupo 1 - Calculadora Basica")
	class BasicCalculatorTest{
		
		
		@Test
		@DisplayName("Suma basica")
		void testBasic1() {
			System.out.println("Basic Calcultator test 1");
		}
	}
	
	
		// 2. Grupo Scientific Calculator
	@Nested
	@DisplayName("Grupo 2 - Calculadora cientifica")
	class ScientificCalculatorTest{
		
		@Test
		@DisplayName("Suma avanzada")
		void testScientific1() {
			System.out.println("Scientific Calcultator test 2");
		}
		
		
		
		@Nested
		@DisplayName("Grupo 2.1 -Funciones trigonometricas")
		class Trigonometric{

			@Test
			@DisplayName("Funciones avanzadas")
			void testScientific2() {
				System.out.println("Scientific Calcultator test 2");
			}
		}
	}
	
	
}
