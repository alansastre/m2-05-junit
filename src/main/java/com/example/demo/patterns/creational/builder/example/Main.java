package com.example.demo.patterns.creational.builder.example;

import java.util.Calendar;

public class Main {
	
	public static void main(String[] args) {
		
		StringBuilder articulo = new StringBuilder().append("Hola").append(" mundo").append(30);
		
		System.out.println(articulo);
		
		Calendar calendar = new Calendar.Builder().setCalendarType("gregory").setDate(2021, 7, 7).build();
		
		
		// posibilidades de testing del patron builder:
		
		// 1. cero parametros
		
		// 2. 1 parametro
		
		// 3. varios parametros
		
		// 4. todos los parametros
		
		// 5 . setter 
	}

}
