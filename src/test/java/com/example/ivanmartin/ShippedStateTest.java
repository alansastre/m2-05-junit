package com.example.ivanmartin;

import static org.junit.Assert.assertNotEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.state.Order;
import com.example.demo.patterns.behavioral.state.OrderState;
import com.example.demo.patterns.behavioral.state.ShippedState;

class ShippedStateTest extends BaseTest{

	ShippedState shippedState = new ShippedState();
	Order order = new Order(1L, LocalDateTime.now());
	
	@DisplayName("Estado siguiente con pedido enviado.") 
	@Test
	void ShippedStateNextTest() {
		OrderState orderState= order.getState();
		shippedState.next(order);
		
		assertNotEquals(orderState, order.getState()); 
	}
	
	@DisplayName("Estado anterior con pedido enviado.") 
	@Test
	void ShippedStatePreviousTest() {
		OrderState orderState= order.getState();
		shippedState.previous(order);
		
		assertNotEquals(orderState, order.getState()); 
	}
	
	

}
