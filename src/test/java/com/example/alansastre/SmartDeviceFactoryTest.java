package com.example.alansastre;

import org.junit.jupiter.api.Test;

import com.example.demo.service.SmartDeviceFactory;
import com.example.demo.domain.SmartDevice;
import com.example.demo.domain.SmartPhone;

import static org.junit.jupiter.api.Assertions.*;

class SmartDeviceFactoryTest {

	
	@Test
	void testSmartPhoneInstance() {
		// 1. preparacion
		
		// 2. ejecucion del codigo a testear
		SmartDevice phone = SmartDeviceFactory.createByType("phone");
		
		// 3. verificaciones
		assertNotNull(phone);
		assertTrue(phone instanceof SmartPhone);
		assertEquals("Default smartphone", phone.getName());
		assertEquals(1L, phone.getId());
	}
	
//	@Test
//	void testSmartPhoneAttributes() {
//		SmartDevice phone = SmartDeviceFactory.createByType("phone");
//		assertNotNull(phone);
//		assertTrue(phone instanceof SmartPhone);
//	
//	}
//	
//	@Test
//	void testSmartPhoneRelationships() {
//		SmartDevice phone = SmartDeviceFactory.createByType("phone");
//		assertNotNull(phone);
//		assertTrue(phone instanceof SmartPhone);
//	
//	}
	
	
//	@Test
//	void createByTypeWatch() {
//		SmartDeviceFactory.createByType("watch");
//	}
}
