package com.example.JuanCarlosGarrido;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.creational.builder.User;

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
	@DisplayName("Creación de User con Set")
	void createUserConSet() {
		User user = new User.setId(2L).
				setFirstName("juan").
				setLastName("Antonio").
				setEmail("ja@yahoo.es").
				setMarried(true);
		assertEquals(2L, user.getId());
		assertEquals("juan", user.getFirstName());
		assertEquals("Antonio", user.getLastName());
		assertEquals("ja@yahoo.es", user.getEmail());
		assertEquals(true, user.getMarried());
	}
	
	@Test
	@DisplayName("Creación de tipo User")
	void createByTypeBuilder(){
		User user = new User.Builder().build();
		assertNull(user.getId());
		User user2 = new User.Builder().setId(3L).build();
		assertEquals(3L, user2.getId());
		User user3 = new User.Builder().setId(3L).setFirstName("juan").build();
		assertEquals("juan", user3.getFirstName());
		User user4 = new User.Builder().setId(3L).setFirstName("juan").setLastName("Antonio").build();
		assertEquals("Antonio", user4.getLastName());
		User user5 = new User.Builder().setId(3L).setFirstName("juan").setLastName("Antonio").setEmail("ja@yahoo.es").build();
		assertEquals("ja@yahoo.es", user5.getEmail());
		User user6 = new User.Builder().setId(3L).setFirstName("juan").setLastName("Antonio").setEmail("ja@yahoo.es").setMarried(true).build();
		assertEquals(true, user6.getMarried());
	}
	
	
}
