package com.example.demo.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class User extends AbstractUser{
	
	
	private List<String> messagesList = new ArrayList<>();
	
	public User(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		this.mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		this.messagesList.add(message);
		System.out.println("received!");
		
	}

	public List<String> getMessagesList() {
		return messagesList;
	}

	public void setMessagesList(List<String> messagesList) {
		this.messagesList = messagesList;
	}

	
	

}
