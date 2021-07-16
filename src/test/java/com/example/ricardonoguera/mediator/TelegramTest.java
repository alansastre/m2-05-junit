package com.example.ricardonoguera.mediator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.mediator.ChatMediator;
import com.example.demo.patterns.behavioral.mediator.Telegram;
import com.example.demo.patterns.behavioral.mediator.User;

class TelegramTest {

	Telegram chatTelegram = new Telegram();
	User user1 = new User(chatTelegram,"ElUsuario1");
	User user2 = new User(chatTelegram,"ElUsuario2");
	
	
	
//	@Test
//	void testSendMessage() {
//		fail("Not yet implemented");
//	}

	@Test
	@DisplayName("Añade usuarios")
	void testAddUser() {
		assertEquals(2, chatTelegram.getUsers().size());
		User user3 = new User(chatTelegram,"ElUsuario3");
		assertEquals(3, chatTelegram.getUsers().size());
	}
	@Test
	@DisplayName("Elimina usuarios")
	void testRemoveUser() {
		assertEquals(2, chatTelegram.getUsers().size());
		chatTelegram.removeUser(user2);
		assertEquals(1, chatTelegram.getUsers().size());
	}

}
