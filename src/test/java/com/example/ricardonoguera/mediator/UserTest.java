package com.example.ricardonoguera.mediator;

import com.example.demo.patterns.behavioral.mediator.*;


import static org.junit.jupiter.api.Assertions.*;

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
    @DisplayName("Envio")
    void envio() {
        chat.addUser(user1);
        user1.send("Mensaje enviado");
        
        
    }
}
