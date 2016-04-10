package com.nyxhemera.gamestates;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nyxhemera.gkgame.GKGame;
import com.nyxhemera.handlers.GameStateManager;

public abstract class GameState {
	
	protected GameStateManager gsm;
	protected GKGame game;
	protected SpriteBatch sb;
	protected OrthographicCamera cam;
	
	public GameState(GameStateManager gsm) {
		this.gsm = gsm;
		this.game = gsm.getGame();
		this.sb = game.getSpriteBatch();
		this.cam = game.getCam();
	}
	
	public abstract void update(float dt);
	public abstract void render();
	public abstract void handleInput();
	public abstract void dispose();

}
