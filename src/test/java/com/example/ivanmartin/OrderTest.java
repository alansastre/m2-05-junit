package com.example.ivanmartin;

import static org.junit.Assert.assertNotEquals;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.state.Order;
import com.example.demo.patterns.behavioral.state.OrderState;
import com.example.demo.patterns.behavioral.state.Product;

public class OrderTest extends BaseTest{
	
	Order order = new Order(1L, LocalDateTime.now());
	
	@DisplayName("Cambio de estado en el pedido al siguiente.") 
	@Test
	void OrderNextTest() {
		OrderState orderState=order.getState();
		order.nextState();
		
		assertNotEquals(orderState, order.getState()); 
	}

	@DisplayName("Cambio de estado en el pedido al anterior.") 
	@Test
	void OrderPreviousTest() {
		OrderState orderState=order.getState();
		order.previousState();
		
		assertNotEquals(orderState, order.getState()); 
	}
	
	@DisplayName("Cambiar id del pedido.") 
	@Test
	void OrderSet() {
		Long aux=order.getId();
		order.setId(64L);
		
		assertNotEquals(order.getId(), aux); 
	}
	
	@DisplayName("Cambiar fecha del pedido.") 
	@Test
	void OrderDate() {
		LocalDateTime aux=order.getDate();
		order.setDate(LocalDateTime.now().plusDays(10));
		
		assertNotEquals(order.getDate(), aux); 
	}
	
	@DisplayName("Cambiar productos del pedido.") 
	@Test
	void OrderProduct() {
		
		List<Product> listaAux = order.getProducts();
		List<Product> lista = order.getProducts();
		
		Product product =new Product();
		
		lista.add(product);
		
		order.setProducts(lista);
		
		assertNotEquals(order.getProducts().toString(), listaAux); 
	}
}
