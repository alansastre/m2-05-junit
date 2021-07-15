package com.example.demo.patterns.structural.decorator.decoradores;

import com.example.demo.patterns.structural.decorator.Photo;

public abstract class PhotoDecorator extends Photo{
	
	protected Photo photo;

	protected PhotoDecorator(Photo photo) {
		super();
		this.photo = photo;
	}
	
	
	

}
