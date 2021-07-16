package com.example.migueldelosrios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.structural.decorator.DigitalPhoto;

public class DigitalPhotoTest {

	DigitalPhoto fotodigital = new DigitalPhoto();
	
	@Test
	@DisplayName("Test devolver foto normal sin editar")
	void showTest() {
		String mostrarfoto = fotodigital.show();
		assertEquals(mostrarfoto, "Normal photo without edit");
	}
	
	@Test
	@DisplayName("Test")
	void costTest() {
//		double cost = fotodigital.cost();
		
	}
	
}
