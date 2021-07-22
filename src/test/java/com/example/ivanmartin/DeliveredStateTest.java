package com.example.ivanmartin;

import static org.junit.Assert.assertNotEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.state.DeliveredState;
import com.example.demo.patterns.behavioral.state.Order;
import com.example.demo.patterns.behavioral.state.OrderState;

class DeliveredStateTest extends BaseTest{

	DeliveredState deliveredState = new DeliveredState();
	Order order = new Order(1L, LocalDateTime.now());
	
	@DisplayName("Estado siguiente con pedido entregado.") 
	@Test
	void deliveredStateNextTest() {
		OrderState orderState= order.getState();
		deliveredState.next(order);
		
		assertNotEquals(orderState, order.getState()); 
	}
	
	@DisplayName("Estado anterior con pedido entregado.") 
	@Test
	void deliveredStatePreviousTest() {
		OrderState orderState= order.getState();
		deliveredState.previous(order);
		
		assertNotEquals(orderState, order.getState()); 
	}
	
	

}
