package com.nyxhemera.gameworld;

import com.nyxhemera.entities.Conflict;
import com.nyxhemera.entities.Kraken;
import com.nyxhemera.entities.Minus;
import com.nyxhemera.entities.Plus;
import com.nyxhemera.screens.GameScreen;

public class GameWorld {
	
	GameScreen screen;
	Kraken kraken;
	Conflict conflict;
	Plus plusArr[];
	Minus minusArr[];
	
	public GameWorld(GameScreen screen) {
		this.screen = screen;
		this.kraken = new Kraken(0, 0); // Temporary numbers
	}
	
	public void update(float delta) {
		
		kraken.update(delta);
		for(int i=0; i<plusArr.length; i++) {
			plusArr[i].update(delta);
		}
		for(int i=0; i<minusArr.length; i++) {
			minusArr[i].update(delta);
		}
	}
	
	public void render(float delta) {
		
		kraken.render(delta);
		for(int i=0; i<plusArr.length; i++) {
			plusArr[i].render(delta);
		}
		for(int i=0; i<minusArr.length; i++) {
			minusArr[i].render(delta);
		}
	}
	
	
	
	// Getters and Setters
	public Kraken getKraken() { return kraken; }
	public Conflict getConflict() { return conflict; }
	

}
