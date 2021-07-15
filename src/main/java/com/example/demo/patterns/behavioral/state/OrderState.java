package com.example.demo.patterns.behavioral.state;

public interface OrderState {

	void next(Order order);
	
	void previous(Order order);
}
