package com.example.migueldelosrios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.patterns.structural.decorator.DigitalPhoto;

public class DigitalPhotoTest {

	DigitalPhoto fotodigital = new DigitalPhoto();
	
	@Test
	void showTest() {
		String mostrarfoto = fotodigital.show();
		assertEquals(mostrarfoto, "Normal photo without edit");
		
	}
	
}
