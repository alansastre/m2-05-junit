package com.example.bea;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Tag;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class) // Es una suite que debe ejecutarse

// 1. filtros por paquete
@SelectPackages("com.example.bea") // filtrar por un paquete 
//@SelectPackages({"com.example", "com.example2"}) // filtrar por varios paquetes

// 2. filtros por clase
//@SelectClasses(CalculatorTest.class) // solo una clase
//@SelectClasses({NestedTest.class, ConditionalTest.class}) // varias clases

// 3. filtro por etiquetas (tiene que estar también uno de los filtros anteriores)
//@IncludeTags("calculations") // filtra aquellos metodos que tengan @Tag("calculations")
//@SuiteDisplayName("Suite de testing") // Nombre a mostrar de la suite
class AllTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {

	}

}
