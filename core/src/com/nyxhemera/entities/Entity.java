package com.nyxhemera.entities;

public abstract class Entity {
	
	private int health;
	private float x, y;
	private float dx, dy;
	
	public Entity(float x, float y) {
		
		this.x = x;
		this.y = y;
		this.dx = 0;
		this.dy = 0;
		
	}
	
	public abstract void update(float delta);
	public abstract void render(float delta);
	
	public boolean move() {
		boolean moveSucc = false;
		
		// Movement
		
		return moveSucc;
	}
	
	public boolean[] frameCollision() {
		boolean[] collArr = null;
		// Check frame collision
		
		// Top, Right, Bottom, Left
		return collArr;
	}
	
	public void removeSelf() {
		
	}
	
	public boolean checkDeath() { return health<=0; }
	
	// Getters and Setters
	public void damageHealth(int dam) {
		health -= dam;
	}
	
	public float getX() { return x; }
	public float getY() { return y; }
	public int getHealth() { return health; }
	

}
