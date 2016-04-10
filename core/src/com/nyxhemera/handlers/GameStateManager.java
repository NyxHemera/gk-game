package com.nyxhemera.handlers;

import java.util.Stack;

import com.nyxhemera.gamestates.GameState;
import com.nyxhemera.gamestates.Menu;
import com.nyxhemera.gamestates.Play;
import com.nyxhemera.gkgame.GKGame;

public class GameStateManager {
	
	private GKGame game;
	
	private Stack<GameState> gameStates;
	
	public static final int MENU = 8392567;
	public static final int PLAY = 3928022;
	
	public GameStateManager(GKGame game) {
		this.game = game;
		gameStates = new Stack<GameState>();
		pushState(MENU);
	}
	
	
	public void update(float dt) {
		gameStates.peek().update(dt);
	}
	
	public void render() {
		gameStates.peek().render();
	}
	
	public void setState(int state) {
		popState();
		pushState(state);
	}
	
	public void pushState(int state) {
		gameStates.push(getState(state));
	}
	
	private GameState getState(int state) {
		switch(state) {
		case MENU :
			return new Menu(this);
		case PLAY : 
			return new Play(this);
		default :
			System.out.println("Improper state change requested");
			return null;
		}
	}
	
	private void popState() {
		GameState g = gameStates.pop();
		g.dispose();
	}
	
	public GKGame getGame() { return game; }

}

















