package com.example.JuanCarlosGarrido;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.creational.builder.User;
import com.example.demo.patterns.creational.builder.User.Builder;

public class TestBuilder {
	
	@Test
	@DisplayName("Creación de User")
	void createUser() {
		Builder user = new Builder();
		user.equals(new User(2L,"","","", true));
			
	}
	
	@Test
	@DisplayName("Creación de tipo User")
	void createByTypeBuilder(){
		//User Builder(); 
		//Builder.class.; 
	}
	
	
}
