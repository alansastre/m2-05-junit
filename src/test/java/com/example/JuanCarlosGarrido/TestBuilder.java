package com.example.JuanCarlosGarrido;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.creational.builder.User;

public class TestBuilder {
	
	@Test
	@DisplayName("Creación de User")
	void createUser() {
		User user = new User(2L,"juan","Antonio","ja@yahoo.es", true);
		assertEquals(2L, user.getId() );
		assertEquals("jjuan", user.getFirstName());
		assertEquals("Antonio", user.getLastName());
		assertEquals("ja@yahoo.es", user.getEmail());
		assertEquals(true, user.getMarried());
	}
	
	@Test
	@DisplayName("Creación de tipo User")
	void createByTypeBuilder(){
		User user = new User(); 
	}
	
	
}
