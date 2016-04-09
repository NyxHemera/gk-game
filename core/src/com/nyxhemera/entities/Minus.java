package com.nyxhemera.entities;

public class Minus extends Entity{

	public Minus(float x, float y) {
		super(x, y);
		
	}

	public void update(float delta) {
		
		if(checkDeath()) {
			removeSelf();
			return;
		}
		
	}

	public void render(float delta) {
		
	}

}
