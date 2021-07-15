package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {

	@Test
	@EnabledOnJre(JRE.JAVA_11) // mi version es la 16, entonces este test no se ejecuta
	void testJava11() {
		System.out.println("Hola mundo");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_16) // mi version es la 16, entonces este test si se ejecuta
	void testJava16() {
		System.out.println("Hola mundo");
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_16) // 11 a 16
	void testJavaRange11To16() {
		System.out.println("Hola mundo");
	}
	
	@Test
	@EnabledOnOs(value = {OS.LINUX, OS.WINDOWS})
	void testSO() {
		System.out.println("Hola mundo");
	}
	
	@Test
	void printSystemProperties() {
		System.getProperties().forEach(
				(key, value) -> System.out.println(key + " " + value)
				);
	}
	
	@Test
	@EnabledIfSystemProperty(named = "os.name", matches = "Windows 11")
	void testSystemProperty() {
		System.out.println("hola mundo");
	}
	
}
