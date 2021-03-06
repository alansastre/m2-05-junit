package com.example.demo.patterns.behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String ccv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String ccv, String dateOfExpiry){
        this.name = name;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public double pay(double amount) {
    	
    	double amount2;
    	if(amount <= 0) {
    		amount2 = amount;
            System.out.println(amount2 + " paid with credir card menor 0");
    	}else {
            System.out.println(amount + " paid with credir card");

    	}
    	return amount * 2;
    }
}
