package com.example.demo.patterns.structural.adapter;

public class TractorAdapter implements Movable{

	public Tractor tractor = new Tractor();
	
	@Override
	public void speedUp(double quantity) {
		if (this.tractor.getSpeed() + quantity < 15) {
			this.tractor.changeMode(1);
		} else {
			this.tractor.changeMode(2);
		}
		
	}

}
