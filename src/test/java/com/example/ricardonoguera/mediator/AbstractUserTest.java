package com.example.ricardonoguera.mediator;

import com.example.demo.patterns.behavioral.mediator.*;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class AbstractUserTest {
	// Cambiar visibilidad en origen
	ChatMediator chat = new Telegram();
    AbstractUser user1 = new User(chat, "ElUsuario1");
    AbstractUser user2 = new User(chat, "ElUsuario2");
    

	
	@Test
	@DisplayName("ChatMediator Instance OK")
	void chatMediatorInstance() {
		assertTrue(chat instanceof ChatMediator);		
	}
	
	@Test
	@DisplayName("User Instance OK")
	void user1Instance() {
		assertTrue(user1 instanceof User);		
	}
	
	@Test
	@DisplayName("User Instance OK")
	void user2Instance() {	
		assertTrue(user2 instanceof User);
	}
	
	@Test
	@DisplayName("User AbstractUser Instance OK")
	void user1AbstractUserInstance() {
		assertTrue(user1 instanceof AbstractUser);		
	}
	
	@Test
	@DisplayName("User AbstractUser Instance OK")
	void user2AbstractUserInstance() {	
		assertTrue(user2 instanceof AbstractUser);
	}
	
	@Test
    @DisplayName("user1 notNull")
    void user1NotNull() {
        assertNotNull(user1);
    }
	
	@Test
    @DisplayName("user1 notEqual user2 ")
    void usersNotEquals() {
        assertNotEquals(user1, user2);
    }
	
	
	
	
}
