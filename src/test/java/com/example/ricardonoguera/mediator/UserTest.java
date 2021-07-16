package com.example.ricardonoguera.mediator;

import com.example.demo.patterns.behavioral.mediator.*;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class UserTest {

	ChatMediator chat = new Telegram();
	User user1 = new User(chat,"ElUsuario1");
	User user2 = new User(chat,"ElUsuario2");
	
    
	@Test
    @DisplayName("Envío y recepción")
    void envioRecepción() {
		chat.addUser(user1);
	    chat.addUser(user2);
        user1.send("Mensaje enviado 1");
        user2.send("Mensaje enviado 2");
        user1.send("Mensaje enviado 3");
        user2.send("Mensaje enviado 4");
        //for (String m : user2.getMessagesList()) {
        assertEquals(4,user2.getMessagesList().size());
			
		}
	@Test
	@DisplayName("User Instance OK")
	void user1Instance() {
		assertTrue(user1 instanceof User);		
	}
	
	@Test
    @DisplayName("user1 notNull")
    void user1NotNull() {
        assertNotNull(user1);
    }
	
        
                
    
}
