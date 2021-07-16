package com.example.JuanCarlosGarrido;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.creational.builder.User;
import com.example.demo.patterns.creational.builder.User.Builder;

public class TestBuilder {
	
	@Test
	@DisplayName("Creación de User")
	void createUser() {
		User user = new User(2L, "juan","Antonio", "ja@yahoo.es", true);
		assertEquals(2L, user.getId() );
		assertEquals("juan", user.getFirstName());
		assertEquals("Antonio", user.getLastName());
		assertEquals("ja@yahoo.es", user.getEmail());
		assertEquals(true, user.getMarried());
	}
	
	@Test
	@DisplayName("Creación de User con sets")
	void createUserConSets() {
		User user = new User(null, null, null, null, null);
		user.setId(3L); 
		user.setFirstName("juan");
		user.setLastName("Antonio");
		user.setEmail("ja@yahoo.es");
		user.setMarried(true);
		assertEquals(3L, user.getId() );
		assertEquals("juan", user.getFirstName());
		assertEquals("Antonio", user.getLastName());
		assertEquals("ja@yahoo.es", user.getEmail());
		assertEquals(true, user.getMarried());
	}
	
	@Test
	@DisplayName("Creación de User con Builder")
	void createUserConBuilder() {
		User user = new User.Builder().setId(5L).
				setFirstName("juan").
				setLastName("Antonio").
				setEmail("ja@yahoo.es").
				setMarried(true).build();
		assertEquals(5L, user.getId());
		assertEquals("juan", user.getFirstName());
		assertEquals("Antonio", user.getLastName());
		assertEquals("ja@yahoo.es", user.getEmail());
		assertEquals(true, user.getMarried());
	}
	
	@Test
	//
	@DisplayName("Creación de User vacio")
	void createEmptyUser(){
		Builder user = new User.Builder();
		assertNull(user.getId());
		Builder user2 = new User.Builder();
		assertNull(user2.getFirstName());
		Builder user3 = new User.Builder();
		assertNull(user3.getLastName());
		Builder user4 = new User.Builder();
		assertNull(user4.getEmail());
		Builder user5 = new User.Builder();
		assertNull(user5.getMarried());
		}
	
	
}
