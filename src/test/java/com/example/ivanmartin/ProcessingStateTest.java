package com.example.ivanmartin;

import static org.junit.Assert.assertNotEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.state.Order;
import com.example.demo.patterns.behavioral.state.OrderState;
import com.example.demo.patterns.behavioral.state.ProcessingState;

class ProcessingStateTest extends BaseTest{

	ProcessingState processingState = new ProcessingState();
	Order order = new Order(1L, LocalDateTime.now());
	
	@DisplayName("Estado siguiente con pedido procesándose.") 
	@Test
	void ProcessingStateNextTest() {
		OrderState orderState= order.getState();
		processingState.next(order);
		
		assertNotEquals(orderState, order.getState()); 
	}
	
	@DisplayName("Estado anterior con pedido procesándose.") 
	@Test
	void ProcessingStatePreviousTest() {
		OrderState orderState= order.getState();
		processingState.previous(order);
		
		assertNotEquals(orderState, order.getState()); 
	}
	
	

}
