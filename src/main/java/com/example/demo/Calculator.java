package com.example.demo;

public class Calculator {

	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public boolean isOdd(int num) {
		return num % 2 != 0;
	}
	
}
