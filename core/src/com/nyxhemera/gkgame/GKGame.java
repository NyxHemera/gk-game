package com.nyxhemera.gkgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nyxhemera.handlers.AssetLoader;
import com.nyxhemera.screens.GameScreen;

public class GKGame extends Game {
	
	private int gameStateNum = 0; // Title: 0 Game: 0

	@Override
	public void create() {
		//GameStateHandler
		Gdx.app.log("GKGame", "created");
		AssetLoader.load();
		setScreen(new GameScreen(this));		
	}
	
	public int getGameStateNum() {
		return gameStateNum;
	}
	
	public void changeState() {
		
	}
	
	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
	
}
